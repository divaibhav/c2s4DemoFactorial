import java.util.Scanner;

public class DemoRecursion {
    public int factorial(int number){
        if(number >=0) {
            //base case
            if (number == 1 || number == 0) {
                return 1;
            }
            return number * factorial(number - 1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number to find its factorial");
        int userInput = scanner.nextInt();
        DemoRecursion demoRecursion = new DemoRecursion();
        int factorial = demoRecursion.factorial(userInput);
        System.out.println("factorial of given number = " + userInput + " is = "  + factorial);
    }
}
