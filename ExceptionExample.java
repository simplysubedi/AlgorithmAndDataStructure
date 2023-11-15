public class ExceptionExample {
    public static void main(String [] args){
        int dividend =5;
        int divisor = 0;
try {
    int result = divideNumbers(dividend,divisor);
    System.out.println("The result is: "+result  );

}
catch (ArithmeticException e){
    System.out.println("Error: "+ e.getMessage());
}
    }

    private static int divideNumbers(int dividend, int divisor){
        if (divisor == 0)
            throw  new ArithmeticException("Cannot divide by 0");

    return dividend/divisor;
    }
}
