public class StringDemo2 {
    public static void main(String[] args){
        String s1 = "Shubham";
        String s2 = s1;
        String s3 = new String("Shubham");
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
    }
}
