import java.util.Scanner;
public class Q17 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int num = sc.nextInt();
 int sum = 0;
 int previousDigit = -1; 
 while (num > 9) {
 int currentDigit = num % 10; 
 int nextDigit = (num / 10) % 10; 
 int twoDigitNum = nextDigit * 10 + currentDigit;
 sum += twoDigitNum;
 num /= 10; 
 }
System.out.println("Sum of consecutive numbers: " + sum); } }