package PromblemSet;
import java.util.Scanner;
//判断一个字符串是否是回文串
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string ");
        String s = input.nextLine();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        int low = 0;
        int high = s.length() - 1;
        boolean is = true;
        while (low < high){
            if (s.charAt(low) != s.charAt(high)){
                is = false;
                break;
            }
            low++;
            high--;
        }
        return is;
    }

}
