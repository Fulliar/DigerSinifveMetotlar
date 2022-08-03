import java.util.Scanner;
import java.util.Arrays;

public class Palindromik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isPalindrome(input.nextLine()));
    }


    static boolean isPalindrome(String word){
        int i = 0;
        int j = word.length()-1;
        while(i < j){
            if(word.charAt(i) == word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return false;
    }
}
