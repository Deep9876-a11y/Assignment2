import java.util.Scanner;

class TooOlder extends Exception {
    public TooOlder(String message) { super(message); }
   }
   class TooYounger extends Exception {
    public TooYounger(String message) { super(message); }
   }
   public class Q24 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name: ");
    String name = sc.nextLine();
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    try {
    if (age > 45) throw new TooOlder("Too old for recruitment");
    if (age < 20) throw new TooYounger("Too young for recruitment");
    System.out.println("Eligible");
    System.out.println("Name: " + name);
    } catch (TooOlder | TooYounger e) {
    System.out.println(e.getMessage());
    }
    }
   }