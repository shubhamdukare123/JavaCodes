import javax.sound.midi.Soundbank;

public class StringDemo1{
    public static void main(String[] args){
        String s1 = "Shubham";
        String s2 = "Shubham";
        String s3 = "Swapnil";
        String s4 = "Swapnil";
        String s5 = new String("Swapnil");
        String s6 = new String("Swapnil");
        String s7 = "Himanshu";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s6));
        System.out.println(System.identityHashCode(s7));
        
        
        
    }
}