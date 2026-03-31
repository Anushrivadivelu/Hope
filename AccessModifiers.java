package task10;

class Librarys{
  private String bname;
  boolean issued;
  protected boolean returned;
  public int bid;

  public void setid(int bid){
    this.bid = bid;
  }
  public void setname(String bname){
    this.bname = bname;
  }
  public void setissued(boolean issued){
    this.issued = issued;
  }
  public void setreturned(boolean returned){
    this.returned = returned;
  }
  public void display(){
    System.out.println("book id: "+ bid);
    System.out.println("book name: "+ bname);
    System.out.println("issused: "+ issued);
    System.out.println("returned: "+ returned);
  }
}
class Student extends Librarys{
  public void access(){
    System.out.println("book id: "+ bid);
    System.out.println("issused: "+ issued);
    System.out.println("returned: "+ returned);
  }
}
public class AccessModifiers {
  public static void main(String[] args) {
    Librarys l = new Librarys();
    l.setid(101);
    l.setname("DSA");
    l.setissued(true);
    l.setreturned(false);

    l.display();

    Student s = new Student();
    s.setid(102);
    s.setissued(true);
    s.setreturned(false);
    s.access();

  }
}
