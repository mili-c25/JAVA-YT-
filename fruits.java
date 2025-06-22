import java.util.*;

public class fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();  
         switch (fruit) {
            case "Mango":
            System.out.println("King of all fruits.");
                break;
                case "Apple":
                System.out.println("A sweet red fruit.");
                break;
                case "Orange":
                System.out.println("A round fruit.");
                break;
                case "Graphes":
                System.out.println("A green fruit.");
         
            default:
            System.out.println("Please enter a valid fruit.");
                break;
         }  
    }
    
}
