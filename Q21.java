class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
    super(message);
    }
   }
   public class Q21 {
    public static void main(String[] args) {
    String country = args.length > 0 ? args[0] : "Unknown";
    try {
    if (country.equalsIgnoreCase("USA")) {
    System.out.println("Capital: Washington, D.C.");
    } else if (country.equalsIgnoreCase("India")) {
    System.out.println("Capital: New Delhi");
    } else {
    throw new NoMatchFoundException("No match found for " + country);
    }
    } catch (NoMatchFoundException e) {
    System.out.println(e.getMessage());
    } } }
   