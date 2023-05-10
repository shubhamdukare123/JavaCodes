public class concatappend {
    public static void main(String[] args) {
        String str1 = "Shubham";
        String str2 = new String("Dukare");
        StringBuffer sb = new StringBuffer("core2web");
        String str3 =  str1.concat(str2);
        StringBuffer sb2 = sb.append(str1);
        System.out.println(str1);//Shubhan
        System.out.println(sb);//core2webShubham
        System.out.println(str3); // ShubhamDukare
        System.out.println(sb2); //core2webShubham
    }
}
