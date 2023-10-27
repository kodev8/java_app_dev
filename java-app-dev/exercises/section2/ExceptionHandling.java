package exercises.section2;

import java.lang.ArithmeticException;

public class ExceptionHandling {
    public static void main(String args[]) {
        int d = 42;
        int a = 0;
        
        try {
            
            int c = d / a;
            if (c != 0) {
                System.out.println("Division by zero error");
            } else {
                System.out.println("The value of c :" + c);
            }
        }catch(ArithmeticException ae) {
        
            System.err.println("Division by zero error");
        //    ae.printStackTrace();
        //    System.err.println(ae.getMessage());
        }
    }
}