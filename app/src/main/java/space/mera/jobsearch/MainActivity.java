package space.mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.*;

import com.melnykov.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView) findViewById(android.R.id.list);//Создаем список для гл страницы
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);//По id находим кнопку
        fab.attachToListView(listView);//крепим кнопку к списку

        String[] items = new String[20];
        for (int i = 0; i < 20; i++) items[i] = "Вакансия номер " + (i + 1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);//Создаем адаптер и заполняем его из массива items
        listView.setAdapter(adapter);

    }


}