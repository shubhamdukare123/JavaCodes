public class giveCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(10);
        System.out.println(sb.capacity());//10
        System.out.println(sb);// __
        sb.append("ShubhamDukare");
        System.out.println(sb);//ShubhamDukare
        System.out.println(sb.capacity()); //(10+1)*2 = 22
    }
}
