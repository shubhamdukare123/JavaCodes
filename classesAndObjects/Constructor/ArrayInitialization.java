import java.util.*;
class Arrayinitialization{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[3] = {30, 15, 20};
        // int[] marks = new int[size];
        // for(int i=0 ; i<size ; i++){
        //     marks[i] = sc.nextInt();
        // }
        // int[] marks = new int[3];
        // marks[1] = 30;
        // marks[0] = 90;
        // marks[2] = 50;
        
        // System.out.println("Marks of english are " + " " + marks[0]);
        for(int i=0; i<size ; i++){
            System.out.println("Marks are" + " " + marks[i]);
        }

    }
}
