package task10;
class car{
  private String brand;
  private String color;
  private double price;
  private int mileage;

  public String getbrand(){
    return brand;
  }
  public void setbrand(String brand){
    this.brand = brand;
  }
  public String getcolor(){
    return color;
  }
  public void setcolor(String color){
    this.color= color;
  }
  public double getprice(){
    return price;
  }
  public void setprice(double price){
    if(price>0) this.price = price;
    else System.out.println("invalid");
  }
  public int getmileage(){
    return mileage;
  }
  public void setmileage(int mileage){
    if(mileage>=0) this.mileage = mileage;
    else System.out.println("invalid");
  }
  public void display(){
    System.out.println("Brand: "+brand);
    System.out.println("Color: "+color);
    System.out.println("Price: "+price);
    System.out.println("Mileage: "+mileage);
  }

}
public class MyCar {
  public static void main(String[] args) {
    car c = new car();
    c.setbrand("TOYOTA");
    c.setcolor("NAVY BLUE");
    c.setprice(2000000);
    c.setmileage(20);
    System.out.println("USING DISPLAY METHOD");
    c.display();
    System.out.println();
    System.out.println("USING GETTER-SETTER");
    System.out.println("BRAND: "+c.getbrand());
    System.out.println("COLOR: "+c.getcolor());
    System.out.println("PRICE: "+c.getprice());
    System.out.println("MILEAGE: "+c.getmileage());
  }
}
