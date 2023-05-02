class StringDemo3{
    public static void main(String[] args){
        String s1 = "Shubham";
        String s2 = "Dukare";
        System.out.println(s1+s2);
        String s3 = "ShubhamDukare";
        String s4 = s1 + s2;
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
    }
}