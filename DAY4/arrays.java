package day4;
public class arrays {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    System.out.println(arr);
    double[] arr1 = {1.0,2.0,3.0};
    System.out.println(arr1);
    int[] arr2 = arr;
    System.out.println(arr2);
    System.out.println(arr2.hashCode());
    arr[0] =10;
    arr2[1] =20;
    System.out.println(arr2[0] +" "+arr[1]);
    System.out.println(arr.toString().substring(3));
    String[] s = {"hello", "world"};
    System.out.println(s.hashCode());
    System.out.println(s);
  }
}
