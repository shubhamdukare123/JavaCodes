public class sbDemo {
    public static void main(String[] args) {
        String str1 = "Shubham";
        String str2 = new String("Dukare");
        StringBuffer sb = new StringBuffer("Core2web");
        StringBuffer str3 = sb.append(str1); // append cha return type ha StringBuffer asto
        System.out.println(str3);//Core2webShubham
        System.out.println(sb);//Core2webShubham
    }
}
