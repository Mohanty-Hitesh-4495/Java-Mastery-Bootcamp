import java.util.Scanner;
//URL=https://leetcode.com/problems/valid-palindrome/
class Solutions {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' ||s.charAt(i)>='a' && s.charAt(i)<='z'|| Character.isDigit(s.charAt(i))){
                result.append(s.charAt(i));
            }
        }
        int j=result.length()-1;
        for(int i=0;i<result.length()-1;i++){
            if(Character.toLowerCase(result.charAt(i))!=Character.toLowerCase(result.charAt(j)))
                return false;
            j--;
        }
        return true;
    }
}
class Solution1 {
    public boolean isPalindrome(String s) {
        int start=0,end=s.length()-1;
        while(start<=end){
            if(!Character.isLetterOrDigit(s.charAt(start)))
                start++;
            else if(!Character.isLetterOrDigit(s.charAt(end)))
                end--;
            else {
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
public class sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        Solutions onb = new Solutions();
        System.out.println(onb.isPalindrome(arr));
    }
}
