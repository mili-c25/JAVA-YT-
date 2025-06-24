import java.util.*;

public class string {
    public static void main(String[] args) {
    // String message = greet();
    //System.out.println(message);
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a name:");
    String name = in.next();
    String personalised = myGreet(name);
    System.out.println(personalised);
    }
static String myGreet(String name) {
     String message = "Hello "   +   name;
     return message;
}

    
    }

