class stringBufferDemo{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb);
        System.out.println(sb.capacity()); // 16
        sb.append("Shubham"); 
        System.out.println(sb);
        System.out.println(sb.capacity());//16

    }
}