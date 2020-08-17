package mera.jobsearch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
public class VacansyAdapter extends ArrayAdapter<VacansyList>{//Адаптер для вакансий
    private LayoutInflater inflater;
    private int layout;
    private List<VacansyList> vacansyLists;

    public VacansyAdapter(Context context, int resource, List<VacansyList> vacansyLists) {
        super(context, resource, vacansyLists);
        this.vacansyLists = vacansyLists;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(this.layout, parent, false);
        TextView nameView = (TextView) view.findViewById(R.id.vacancy_name);
        TextView companyView = (TextView) view.findViewById(R.id.company_name);
        TextView salaryView = (TextView) view.findViewById(R.id.salary);
        VacansyList vacansyList = vacansyLists.get(position);
        nameView.setText(vacansyList.getVacansyName());
        companyView.setText(vacansyList.getCompanyName());
        salaryView.setText(vacansyList.getSalary());
        return view;
    }
}
