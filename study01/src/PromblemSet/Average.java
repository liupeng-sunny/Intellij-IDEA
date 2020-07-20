package PromblemSet;
import java.sql.SQLOutput;
import java.util.Scanner;
//随机读取不确定个数的整数，统计正数和负数的个数
public class Average {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int posi = 0;
        int nega = 0;
        int sum = 0;
        System.out.println("Enter an integer,the input end if it is 0:");
        double average = 0.0;
        do {
            num = input.nextInt();
            if(isPositiveNumber(num)){
                posi++;
            }
            if(isPositiveNumber(num) == false){
                nega++;
            }
            sum = sum + num;
        }while (num != 0);
        average = sum / ( posi + nega );
        System.out.println("The number of positive is " + posi);
        System.out.println("The number of negative is " + nega);
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }

    public static boolean isPositiveNumber(int j){
        return true? j > 0 : j < 0;
    }
}
