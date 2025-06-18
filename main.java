
import java.util.*;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tempc,tempf;
        System.out.println("Enter temperature in celcius:");
        tempc= sc.nextFloat();
        tempf= (tempc * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is:" + tempf);
    }
}