package OOPs;

import java.util.*;
class DemoStrings{
	static String swap(String str){
		StringBuffer str1 = new StringBuffer(str);
//		char [] arr = str1.wait(":");
//		System.out.println(arr.charAt(0));
		return str;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A STRING :");
		String str = sc.next();
		System.out.println(swap(str));
    }
}
