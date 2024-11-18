import java.util.Scanner;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) { super(message); }}

   class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) { super(message); }
   }
   public class Q25 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = sc.nextLine();
    System.out.print("Enter password: ");
    String password = sc.nextLine();
    try {
    if (username.length() < 6) throw new InvalidUsernameException("Username must be at least 6 characters");
    if (!password.equals("secret123")) throw new InvalidPasswordException("Incorrect password");
    System.out.println("Login successful");
    } catch (InvalidUsernameException | InvalidPasswordException e) {
    System.out.println(e.getMessage());
    }
    }
   }
   