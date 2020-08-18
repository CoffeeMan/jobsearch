package mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.widget.Toolbar;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.api.EmployeeControllerApi;
import io.swagger.client.model.Employee;
import mera.jobsearch.adapters.VacansyAdapter;
import mera.jobsearch.adapters.VacansyList;

public class Home_screenActivity extends AppCompatActivity {
    private FloatingActionButton add_vacation;
    private Button button2;
    private List<VacansyList> vacansyLists = new ArrayList();
    ListView myList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);
        setInitialData();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);//toolbar по material design
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
        addListenerOnButtons();
        createDrawer(toolbar);


        myList = (ListView) findViewById(R.id.list);
        VacansyAdapter vacansyAdapter = new VacansyAdapter(this, R.layout.list_item, vacansyLists);
        myList.setAdapter(vacansyAdapter);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                VacansyList selectedVacancy = (VacansyList) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "Был выбран пункт " + selectedVacancy.getVacansyName(),
                        Toast.LENGTH_SHORT).show();
            }
        };
        myList.setOnItemClickListener(itemListener);


    }

    private void addListenerOnButtons() {
        add_vacation = (FloatingActionButton) findViewById(R.id.add_vacation);
        add_vacation.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent move = new Intent(Home_screenActivity.this, Add_vacationActivity.class);
                        startActivity(move);
                    }
                }
        );

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        new requestVacancy().execute();


                    }
                }
        );
    }

    class requestVacancy extends AsyncTask<Void, Employee, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //Toast.makeText(Home_screenActivity.this, "Start", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {


                EmployeeControllerApi api = new EmployeeControllerApi();
                api.getApiClient().setBasePath("http://188.130.168.107:8080");
            /*Pageable pageable = new Pageable();
            pageable.setPage(0);
            pageable.setSize(2);
            Object o = api.getList1(pageable);*/
                long id = 84;
                try {
                    Employee result = api.findById3(id);
                    publishProgress(result);
                } catch (ApiException e) {
                    e.printStackTrace();
                }

            } catch (Throwable e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Employee... employees) {
            super.onProgressUpdate(employees);
            Toast.makeText(Home_screenActivity.this, employees[0].getName(), Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            //Toast.makeText(Home_screenActivity.this, "lol", Toast.LENGTH_SHORT).show();
        }
    }

    private void setInitialData() {
        vacansyLists.add(new VacansyList("Стажёр", "Mera", "10000"));
        vacansyLists.add(new VacansyList("Джун", "Mera", "15000"));
        vacansyLists.add(new VacansyList("Мидл", "Mera", "20000"));
        vacansyLists.add(new VacansyList("Сеньор", "Mera", "25000"));
        vacansyLists.add(new VacansyList("Менеджер", "Mera", "30000"));

    }


    public void createDrawer(Toolbar toolbar) {
        Drawer.Result drawerResult = new Drawer()//Боковое меню
                .withActivity(this)
                .withToolbar(toolbar)

                .withDisplayBelowToolbar(true)
                .withActionBarDrawerToggleAnimated(true)
                .addDrawerItems(new PrimaryDrawerItem()
                                .withName(R.string.nav_menu_item_home)
                                .withIcon(R.drawable.ic_home_black_18dp)
                                .withIdentifier(1),
                        new DividerDrawerItem(),
                        new SecondaryDrawerItem()
                                .withName(R.string.nav_menu_item_admin_panel)
                                .withIcon(R.drawable.ic_assignment_ind_black_18dp),

                        new SecondaryDrawerItem()
                                .withName(R.string.nav_menu_item_settings)
                                .withIcon(R.drawable.ic_build_black_18dp)
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        switch (position) {
                            case 1:
                                Intent intent = new Intent(Home_screenActivity.this, Home_screenActivity.class);
                                startActivity(intent);
                                break;
                            case 2:
                                Intent intent_adm = new Intent(Home_screenActivity.this, AdminActivity.class);
                                startActivity(intent_adm);
                                break;
                            case 3:

                                Intent intent_settings = new Intent(Home_screenActivity.this, SettingsActivity.class);
                                startActivity(intent_settings);
                                break;
                        }

                    }
                })
                .build();
    }
}