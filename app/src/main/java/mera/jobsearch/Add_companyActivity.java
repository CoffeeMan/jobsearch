package mera.jobsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import io.swagger.client.api.CompanyControllerApi;
import io.swagger.client.model.Company;

public class Add_companyActivity extends AppCompatActivity {

    TextInputLayout[] inital = new TextInputLayout[7];//Для получения инфы из полей
    Button send;
    String[] data = new String[7];//сами поля
    //id компонентов
    int[] idLayouts = {R.id.nameCompany, R.id.industry, R.id.description, R.id.reference, R.id.city, R.id.website, R.id.email};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_company);



        ListenerOnButtons();
    }
    private void ListenerOnButtons() {//если отправить пустую строку, то всё сломается, установить обяз поля
        send = (Button) findViewById(R.id.sendButton);
        send.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        for (int i = 0; i < 7; i++){
                            inital[i] = (TextInputLayout)findViewById(idLayouts[i]);
                            data[i] = inital[i].getEditText().getText().toString();

                        }
                    }
                }
        );
    }




    public class addCompany extends AsyncTask<String, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            //Toast.makeText(Home_screenActivity.this, "Start", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected Void doInBackground(String... strings) {

            CompanyControllerApi apiInstance = new CompanyControllerApi();
            apiInstance.getApiClient().setBasePath("http://188.130.168.107:8080");
            Company body = new Company();
            body.setName(strings[0]);
            body.setIndustry(strings[1]);
            body.setDescription(strings[2]);


            publishProgress();
            return null;
        }



        @Override
        protected void onProgressUpdate(Void... result) {
            super.onProgressUpdate(result);
            Toast.makeText(Add_companyActivity.this, "Готово", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            //Toast.makeText(Home_screenActivity.this, "lol", Toast.LENGTH_SHORT).show();
        }
    }
}