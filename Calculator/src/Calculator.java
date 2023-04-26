import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
//declaring variables
        double firstNumber;
        double secondNumber;
        double result_operation_output;
        //Creating scanner for object to allow input
        Scanner input = new Scanner(System.in);

        do{

            // 1. + for ADDITION
            // 2. - for SUBTRACTION
            // 3. * for MULTIPLICATION
            // 4. / for DIVISION
            // 5. % for REMINDER"
            // 6. ^ for POWER
            // 7. Q for QUITE"

            //ask user to enter the first input
            System.out.println("Enter the first number: ");
            firstNumber = input.nextDouble();

            System.out.println("Enter the operator like (+, -, *, /, %, ^) only:");
            //storing the operator in the character object
            char operator = input.next().charAt(0);

            //ask user to enter second input,
            System.out.println("Enter the second number: ");
            secondNumber = input.nextDouble();

            switch (operator){
                case '+':
                    result_operation_output = firstNumber + secondNumber;
                    break;
                case '-':
                    result_operation_output = firstNumber - secondNumber;
                    break;
                case '*':
                    result_operation_output = firstNumber * secondNumber;
                    break;
                case '/':
                    result_operation_output = firstNumber / secondNumber;
                    break;
                case '%':
                    result_operation_output = firstNumber % secondNumber;
                    break;
                case '^':
                    result_operation_output = Math.pow(firstNumber, secondNumber);
                    break;
                case 'Q':
                    System.exit(0);
                default:
                    System.out.println("Please enter the specified operator only");
                    return;
            }
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " +result_operation_output);
        }while (result_operation_output != 'Q');
        input.close();
    }
}
