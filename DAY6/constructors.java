package day6;
class dconstructors{
  dconstructors(){
    System.out.println("from default constructor");
  }int x = 20;
}
class pconstructors{
  int y;
  pconstructors(int y){
    this.y= y;
    System.out.println("int:"+y);
  }
}
public class constructors {
  public static void main(String[] args) {
    //System.err.println("from class");
    dconstructors dcon = new dconstructors();
    //System.out.println(dcon);
    //System.out.println(dcon.x);
    pconstructors pcon = new pconstructors(222);
    System.out.println(pcon);
  }
}