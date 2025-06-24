import java.util.*;


public class sum {
    public static void main(String[] args) {
       int ans = sum3(10,20); //calling function.
       System.out.println(ans);
       // sum(); This is for again taking input and printing the sum again for the second time.
    }
     //Passing the arguements
     static int sum3(int a,int b){
        int sum = a + b;
        return sum;
     }




    //returning the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum;
    }


     static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is:" + sum);
    }
}