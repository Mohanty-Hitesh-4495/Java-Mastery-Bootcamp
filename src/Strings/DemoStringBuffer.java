package Strings;// StringBuffer : -> This is a class of java.lang package.
//                -> it is mutable string.
//                -> how to declare: StringBuffer sb = new StringBuffer("HITESH MOHANTY");
//                -> StringBuffer is ThreadSafe.
//                -> ThreadSafe means one request is going that is locked.
// Synchronized StringBuffer method : replace(int.int.java.lang.String)
//                                    delete(int,int)
//                                    insert(int , String)
//HomeWork: ensureCapacity()
//StringBuilder: -> It is like StringBuffer
//               -> It is mutable.
//               -> It has most of the same Method as StringBuffer
//               -> Synchronization is not there.

public class DemoStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("GIFT AC");
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb.length());
        System.out.println(sb1.capacity());
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        StringBuffer sb2 = new StringBuffer("GIFT AC");
//        sb2.indexOf("AC");
        System.out.println(sb2.delete(4,7)+"PK");
        StringBuffer sb3 = new StringBuffer("GIFT AC");
        System.out.println(sb3.insert(7," BBSR"));
        System.out.println(sb2.reverse());
//      String to StringBuffer conversion
        String str="GIFT";
        StringBuffer sb4=new StringBuffer(str);
        StringBuffer sb5=sb4.append("AC");
        System.out.println(sb4);
        System.out.println(sb5);
        String str1=new String(sb5);
        System.out.println(str1);
//      constructor of String
        String s1 = new String("Animal");
        String s2 = new String(sb4);
        char[] ch = {'A','B'};
        String s8 = new String(ch);
        byte[] b = {97,98,99};
        String s9 = new String(b);
        CharSequence cs = "GEC";
        System.out.println(cs);
        System.out.println(s8);
        System.out.println(s9);
    }
}
