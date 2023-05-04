public class hashCode1 {
    public static void main(String[] args) {
        String str1 = "Shubham";        
        String str2 = "Shubham";        
        String str3 = new String("Shubham");        
        String str4 = new String("Shubham"); 
        String str5 = new String("Shashi"); 
            
        
        //Hash Code is same for same strings
        //Hash Code is same in every machine
        System.out.println(str1.hashCode()); //1000
        System.out.println(str2.hashCode()); //1000
        System.out.println(str3.hashCode()); //1000
        System.out.println(str4.hashCode()); //1000
        System.out.println(str5.hashCode()); //1000



                
    }
    
}
