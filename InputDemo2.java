import java.io.*;

class InputDemo2 {
    public static void main(String s[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String s1 = br.readLine();
        System.out.println("My name is "+s1);


    }
}
