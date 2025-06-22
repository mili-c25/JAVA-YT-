import java.util.*;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.nextLine();

        switch (empID) {
            case 1:
                System.out.println("877657");
                break;

                case 2 :
                System.out.println("677899");
                break;

                case 3 :
                System.out.println("986656");
                switch (department) {
                    case "Microbiology":
                        System.out.println("Microbiology Department");
                        break;
                        case "IT" :
                        System.out.println("IT Department");
                        break;
                
                    default:
                    System.out.println("Enter valid  dept.");
                }
                        break;
               
        
            default:
            System.out.println("Enter valid empid.");
                
        }
    }
}
