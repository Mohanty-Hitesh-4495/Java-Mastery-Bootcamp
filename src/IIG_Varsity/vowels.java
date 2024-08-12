package IIG_Varsity;

public class vowels {
    public static void main(String[] args) {
        String college = "Gandhi Institute For Thecnology";
        char[] arr = college.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] == 'A' || arr[i] == 'a')||(arr[i] == 'E' || arr[i] == 'e')||(arr[i] == 'I' || arr[i] == 'i')||(arr[i] == 'O' || arr[i] == 'o')||(arr[i] == 'U' || arr[i] == 'u')) {
                count += 1;
            }
        }
        System.out.println("The given string:"+" "+college);
        System.out.println("The number of IIG_Varsity.vowels present in string : " + count);
    }
}
