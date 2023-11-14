import java.util.Scanner;

public class BinaryMultiplication {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two binary numbers:");
        String num1 = sc.next();
        String num2 = sc.next();
        for (int i = 0; i<num1.length(); i++){
        if(num1.charAt(i) != '1' && num1.charAt(i)!= '0')
            System.out.println("Invalid binary");
    }
        for (int i = 0; i < num2.length(); i++){
            if(num2.charAt(i) != '1' && num2.charAt(i)!= '0')
                System.out.println("Invalid binary");
        }

        int numInBinary1 = Integer.parseInt(num1 , 2);
        int numInBinary2 = Integer.parseInt(num2 , 2);
        int product = numInBinary1 * numInBinary2;
        System.out.println("The product is: "+Integer.toBinaryString(product)+" which is "+product+" in decimal.");

    }
}
