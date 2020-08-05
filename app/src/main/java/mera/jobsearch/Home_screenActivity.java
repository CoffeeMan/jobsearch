package mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.widget.Toolbar;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

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
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id, IDrawerItem drawerItem) {
                        switch (position){
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