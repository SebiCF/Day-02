import java.util.Scanner;
public class main {
    public static void main(String[] Args){
//
//        int inputNumber;
//        System.out.println("Enter a number");
//        Scanner input = new Scanner(System.in);
//        inputNumber = Integer.parseInt(input.nextLine());
//        if (inputNumber < 0){
//            System.out.println("Number is negative");
//        }
//        else if(inputNumber == 0){
//            System.out.println("Your number is 0");
//        }
//        else System.out.println("Number is positive");
//        first

        float inputNumber = 0;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        inputNumber = Float.parseFloat(input.nextLine());
        String numberSize = "";

        if (inputNumber > 1_000_000){
            numberSize = " large";
        }
        else if(inputNumber < 0){
            numberSize = " small";
        }
        else{}

        if (inputNumber < 0){
            System.out.println(inputNumber+" is a"+numberSize+" negative number");
        }
        else if(inputNumber == 0){
            System.out.println("Your number is 0");
        }
        System.out.println(inputNumber+" is a"+numberSize+" positive number");
    }
}
