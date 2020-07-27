package space.mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.widget.Toolbar;
import com.melnykov.fab.FloatingActionButton;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;

public class Home_screenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_screen);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);//toolbar по material design
        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

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

                .build();


        ListView listView = (ListView) findViewById(android.R.id.list);//Создаем список для гл страницы
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);//По id находим кнопку
        fab.attachToListView(listView);//крепим кнопку к списку

        String[] items = new String[20];
        for (int i = 0; i < 20; i++) items[i] = "Вакансия номер " + (i + 1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);//Создаем адаптер и заполняем его из массива items
        listView.setAdapter(adapter);

    }


}