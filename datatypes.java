public class datatypes{
  /**
   * @param args
   */
  public static void main(String[] args){
    //byte
    byte x = -128;
    byte y = 127;
    System.out.println("Range :" + x + " to " + y);
    //short
    short m = -10000;
    short n = 9999;
    System.out.println("Range :" + m + " to " + n);
    //INTEGER
    System.out.println(Integer.MIN_VALUE+ " to " + Integer.MAX_VALUE);
    //LONG
    System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    //DOUBLE
    System.out.println(Double.MIN_VALUE+ " to " + Double.MAX_VALUE);
    //boolean
    boolean a= true;
    boolean b= false;
    System.out.println("VALUES :" + a + " and "+ b);
    //string
    String s1 ="hello";
    String s2 = "hello";
    System.out.println(s1==s2);
    String s3 = new String("hello");
    String s4 = new String("hello");
    System.out.println(s3==s4);
    String s5 = new String("Hello");
    String s6 = new String("Hello");
    s5="hello";
    s6="hello";
    System.out.println(s5==s6);
  }
}