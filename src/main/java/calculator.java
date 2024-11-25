import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        double firstNumber = sc.nextDouble();

        System.out.println("Introduce el segundo numero:");
        double secondNumber = sc.nextDouble();

        System.out.println("Introduce la operacion:");
        String operation = sc.next();

        double result = doCalculation(firstNumber, secondNumber, operation);


        System.out.println("El resultado de la operacion " + operation + " es: " + result);
        }

    private static double doCalculation(double firstNumber, double secondNumber, String operation) {
        switch (operation) {
            case "+":
                return sum(firstNumber, secondNumber);
            case "-":
                return minus(firstNumber, secondNumber);
            case "*":
                return multiplicacion(firstNumber, secondNumber);
            case "/":
                return divicion(firstNumber, secondNumber);
            default:
          throw new IllegalArgumentException("operacion desconocida");
        }
    }
    private static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber; }
        private static double minus(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }
        private static double multiplicacion(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
    }
        private static double divicion(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
    }
}


















