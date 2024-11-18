class TooHot extends Exception {
    public TooHot(String message) { super(message); }
}
class TooCold extends Exception {
    public TooCold(String message) { super(message); }
}
public class Q23 {
    public static void main(String[] args) {
        int temp = Integer.parseInt(args[0]);
        try {
            if (temp > 35) throw new TooHot("Temperature is too hot!");
            if (temp < 5) throw new TooCold("Temperature is too cold!");
            System.out.println("Normal temperature");
            System.out.println("Temperature in Fahrenheit: " + (temp * 9/5 + 32));
        }
        catch (TooHot | TooCold e) {
            System.out.println(e.getMessage());
        }
    }}

   