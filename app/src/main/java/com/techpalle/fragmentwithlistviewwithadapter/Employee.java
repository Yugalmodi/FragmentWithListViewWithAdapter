package com.techpalle.fragmentwithlistviewwithadapter;

/**
 * Created by DELL on 20-Dec-16.
 */
public class Employee {
    private String enumber, ename, esalary;

    public Employee() {
    }

    public Employee(String enumber, String ename, String esalary) {
        this.enumber = enumber;
        this.ename = ename;
        this.esalary = esalary;
    }

    public String getEnumber() {
        return enumber;
    }

    public void setEnumber(String enumber) {
        this.enumber = enumber;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsalary() {
        return esalary;
    }

    public void setEsalary(String esalary) {
        this.esalary = esalary;
    }
}
