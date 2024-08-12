import java.util.Scanner;

public class ReplaceWord {
    static String mostFrequent(String str){
        String word;
        int prevCount=0,nexCount=0;String frequent = new String();
        String[] arr = str.split(" ");
        for(int i=0;i< arr.length;i++){
            word = arr[i];
            for(int j=0;j<arr.length;j++){
                if(word.equalsIgnoreCase(arr[j])){
                    nexCount++;
                }
                else if( word.length()>arr[i].length() && word.equalsIgnoreCase(arr[i].substring(0,arr[i].length()-1))){
                    nexCount++;
                }
            }
            if(prevCount<nexCount) {
                prevCount = nexCount;
                frequent=word;
            }
            nexCount=0;
        }
        return frequent;
    }
    static String leastFrequent(String str){
            String word;
            int prevCount=0,nexCount=0;String frequent = new String();
            String[] arr = str.split(" ");
            for(int i=0;i< arr.length;i++){
                word = arr[i];
                for(int j=0;j<arr.length;j++){
                    if(word.equalsIgnoreCase(arr[j])){
                        nexCount++;
                    }
                    else if( word.length()>arr[i].length() && word.equalsIgnoreCase(arr[i].substring(0,arr[i].length()-1))){
                        nexCount++;
                    }
                }
                if(prevCount>nexCount) {
                    prevCount = nexCount;
                    frequent=word;
                }
                nexCount=0;
            }
            return frequent;
    }
    static String changes(String str,String replace,String replaceWith){
        StringBuilder str1= new StringBuilder();
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            String str2=arr[i];
            if(str2.equalsIgnoreCase(replaceWith) ){
                arr[i]=replace;
            }
            else if( str2.length()>replaceWith.length() && replaceWith.equalsIgnoreCase(str2.substring(0,str2.length()-1))){
                arr[i]=replace+arr[i].charAt(str2.length()-1);
            }
            str1.append(arr[i]);
            str1.append(" ");
        }
        str = new String(str1);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Passage : ");
        String passage = sc.nextLine();
        System.out.println("Enter the Replace word :");
        String replace = sc.next();
        System.out.println("Enter the that you want to replace with :");
        String replaceWith = sc.next();
        System.out.println(passage);
        String str = changes(passage,replace,replaceWith);
        System.out.println(str);
        System.out.println(mostFrequent(str));
        System.out.println(leastFrequent(str));

    }
}
