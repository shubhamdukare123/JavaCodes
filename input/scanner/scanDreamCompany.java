import java.util.*;
public class scanDreamCompany {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your dream company");
        String company = sc.nextLine();

        System.out.println("Enter dream package");
        long lpa = sc.nextLong();

        System.out.println("Dream company is" + " " + company);
        System.out.println("Package is"+ " " + lpa);
    }
}
