import java.io.*;

public class Emp{
    String name;
    String company;
    int age;
    double invest;
    public Emp(String name){
        this.name=name;
    }
    public void Empcompany(String Empcom){
        company=Empcom;
    }
    public void Empage(int empage)
    {
        age=empage;
    }
    public void Empinvest(double empinvest)
    {
        invest=empinvest;
    }
    public void println()
    {
        System.out.println(" name: " + name);
        System.out.println(" company " + company);
        System.out.println(" age " + age);
        System.out.println(" invest " + invest);

    }
}