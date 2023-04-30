import java.util.Scanner;
public class scanPrimitiveData {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer");
        int number = sc.nextInt();
        System.out.println("Integer is" + " "+ number);

        System.out.println("Enter Float Number");
        float no = sc.nextFloat();
        System.out.println("Float value is"+ " "+ no);

        System.out.println("Enter Double");
        Double dob = sc.nextDouble();
        System.out.println("Double is" + " "+ dob);

        System.out.println("Enter Long");
        long lg = sc.nextLong();
        System.out.println("Long is" + " "+ lg);

        System.out.println("Enter Short");
        Short sh = sc.nextShort();
        System.out.println("Short is" + " "+ sh);

        System.out.println("Enter Byte");
        byte by = sc.nextByte();
        System.out.println("Byte is" + " "+ by);

        System.out.println("Enter Boolean");
        Boolean bl = sc.nextBoolean();
        System.out.println("Boolean is" + " "+ bl);
        
        System.out.println("Enter Character");
        char ch = sc.next().charAt(0);
        System.out.println("Character  is" + " "+ ch);

        System.out.println("Enter String");
        String st = sc.next();
        System.out.println("String is" + " "+ st);

    }
}
