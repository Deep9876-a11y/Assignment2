class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
    super(message);
    }
   }
   public class Q22 {
    public static void main(String[] args) {
    try {
    int a = 10;
    int b = 0;
    if (b == 0) throw new CustomArithmeticException("Division by zero");
    int result = a / b;
    System.out.println(result);
    } catch (CustomArithmeticException e) {
    System.out.println("Custom Arithmetic Exception caught: " + e.getMessage());
    }
    }
   }