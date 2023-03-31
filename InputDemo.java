import java.io.*;
public class InputDemo {
    public static void main(String s[])throws IOException{
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String str1 = br1.readLine();
        br1.close();
        System.out.println("Enter her name");
        String str2 = br2.readLine();


    }
}
