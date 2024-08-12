import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();

        char[] str1char = str1.toCharArray();
        char[] str2char = str2.toCharArray();

        int[] fre1 = new int[26];
        int[] fre2 = new int[26];

        for(char letter : str1char){
            fre1['a'-letter]++;
        }

        for(char letter : str2char){
            fre2['a'-letter]++;
        }

        for(int i=0;i<fre1.length;i++){
            if(fre1[i]!=fre2[i]){
                System.out.println("Not Anagrams");
                System.exit(0);
            }
        }
        System.out.println("Anagrams");
    }
}
