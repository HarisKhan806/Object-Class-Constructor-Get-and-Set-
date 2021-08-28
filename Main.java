import org.w3c.dom.NameList;

public class Main{
  String name;
  String company;
  int age;
  public Main(String name,String company)
  {
    this.name=name;
    this.company=company;
    
  }
  public void setage(int age){
    this.age=age;
    
  }
  public int getage(){
    System.out.println("My age is that" + " " + age);
    return age;
  }
  public static void main(String[] args){
    Main obj = new Main("Haris Khan","Hk's Coding");
    System.out.println("My name is"+ " " + obj.name + " My Company is"+ " " + obj.company);
    obj.setage(21);
    obj.getage();

    
  }

}