
import java.util.Scanner;

public class JavaOperators {
    public static void main(String args[]){
        int num = 5;
        //Java Unary Operator Example: ++ and --
        System.out.println("Post increment"+num++);
        System.out.println("Pre increment"+ ++num);
        System.out.println("Post Decrement"+ num--);
        System.out.println("Pre Decrement"+ --num);
        int num1 = 10;
        int num2 = 10;
        System.out.println(num1++ + ++num1);
        System.out.println(num2++ + num2++);

        //Java arithmetic operators are used to perform addition,
        // subtraction, multiplication, and division. They act as basic mathematical operations.

        int num3 =55;
        int num4 =45;
        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 * num4);
        System.out.println(num3 / num4);
        System.out.println(num3 % num4);


        //Java AND OR and NOT Equal(!) and == operator
        boolean flag = true;
        boolean flag2 = false;
        System.out.println(flag == flag2);
        System.out.println(flag || flag2);
        System.out.println(flag && flag2);
        System.out.println(flag != flag2);

        //Java Ternary Operators
        int num5 = 51;
        int num6 = 6;
        int min = ( num5 < num6) ? num5 : num6;
        System.out.println(min);


        //Taking Input form the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the umber");
        int num7 = sc.nextInt();
        System.out.println(num7);
    }
}
