package mera.jobsearch.adapters;

public class VacansyList {//Класс хранит информацию о вакансиях для адаптера
    private String vacansyName;
    private String companyName;
    private String salary;

    public VacansyList(String vacansyName, String companyName, String salary){
        this.vacansyName = vacansyName;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getVacansyName() {
        return vacansyName;
    }

    public void setVacansyName(String vacansyName) {
        this.vacansyName = vacansyName;
    }
}

