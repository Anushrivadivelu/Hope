package task9;

public class Wrapperfunction {
    public static void main(String[] args) {
        int a = 10;
        Integer obj1 = Integer.valueOf(a);   
        Integer obj2 = a;                   
        System.out.println("Boxing: " + obj1 + ", " + obj2);

        int b = obj1.intValue();   
        int c = obj2;              
        System.out.println("Unboxing: " + b + ", " + c);

        int num = Integer.parseInt("123");
        double d = Double.parseDouble("12.34");
        System.out.println("Parsed int: " + num);
        System.out.println("Parsed double: " + d);

        Integer val = Integer.valueOf("456");
        Double dVal = Double.valueOf("45.67");
        System.out.println("valueOf: " + val + ", " + dVal);

        String str = Integer.toString(100);
        System.out.println("toString: " + str);

        Integer x = 10, y = 20;
        System.out.println("compareTo: " + x.compareTo(y)); 
        System.out.println("equals: " + x.equals(y)); 

        char ch = 'A';
        System.out.println("isDigit: " + Character.isDigit(ch));
        System.out.println("isLetter: " + Character.isLetter(ch));
        System.out.println("toLowerCase: " + Character.toLowerCase(ch));

        Boolean bool = Boolean.valueOf("true");
        System.out.println("Boolean value: " + bool);
        System.out.println("Integer Max: " + Integer.MAX_VALUE);
        System.out.println("Integer Min: " + Integer.MIN_VALUE);

        Integer numObj = 50;
        System.out.println("byteValue: " + numObj.byteValue());
        System.out.println("doubleValue: " + numObj.doubleValue());
    }
}
