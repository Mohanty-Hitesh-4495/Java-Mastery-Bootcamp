package Strings;

// Methods of string method :
//    1.length()
//    2.charAt()
//    3.equals()
//    4.startWith()
//    5.EnsWith()
//    6.indexOf()
//    7.subString(int)
//    8.SubsString(int,int)
//    9.split()
//    10.compareTo()
public class DemoString {
    public static void main(String[] args) {
        String s1=" MY NAME IS HITESH MOHNATY ";
        int length=s1.length();
        System.out.println(length);
        char ch=s1.charAt(0);
        System.out.println(ch);
        String s2=" MY NAME IS RAHUL MOHANTY ";
        boolean ans=s1.equals(s2);
        System.out.println(ans);
        boolean start=s1.startsWith("MY");
        boolean end=s1.endsWith("gift");
        System.out.println(start);
        System.out.println(end);
        int hash=s1.hashCode();
        System.out.println(hash);
        int index=s1.indexOf("H");
        System.out.println(index);
        System.out.println(s1.lastIndexOf("H"));
        System.out.println(s1);
        System.out.println(s1.indexOf("M")+" "+s1.indexOf("M",1)+" "+s1.lastIndexOf("M"));
        String s3=s1.concat(" RABINDRANATH");
        System.out.println(s3);
        String str[]=s3.split(" ");
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
        System.out.println(s1.toLowerCase());
        System.out.println(s3.trim());
        System.out.println(s2.strip());
        System.out.println(s2.stripLeading()+"g");
        System.out.println("g"+s2.stripTrailing());
        String a=Integer.toString(56);

    }
}
