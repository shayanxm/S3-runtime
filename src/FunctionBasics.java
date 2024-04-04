import java.util.Scanner;

public class FunctionBasics {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        printEnteredValue(scanner);

    }
    public static void printEnteredValue(Scanner scanner){
        System.out.println("enter number 1");
        int a = scanner.nextInt();
        System.out.println("enter number 2");

        int b = scanner.nextInt();
        System.out.println(a+b);

    }
    //pass passing parameter by value
}
