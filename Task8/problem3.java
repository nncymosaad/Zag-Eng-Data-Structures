import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int[] freqarray = new int[26];
        char[] wordarr = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= 'z' && word.charAt(i) >= 'a')
                freqarray[(word.charAt(i)) - 'a']++;
            else {
                System.out.println("you must enter lower case letters only(a-z)");
                return;
            }
        }
        int j = 0;
        for (int i = 0; i < freqarray.length; i++) {
            while (freqarray[i] > 0) {
                wordarr[j] = (char)(i+'a');
                freqarray[i]--;
                j++;
            }
        }
        for (int i = 0; i < wordarr.length; i++) {
            System.out.print(wordarr[i]);
        }
    }
}