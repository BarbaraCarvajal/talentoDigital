package Trabajos;

import java.util.Scanner;

public class Calculadora2 {
    // variables globales
    public static Scanner teclado = new Scanner(System.in);
    public static int num1, num2;
    public static float resultado;

    public static void main(String[] args) {
        // pedir operandos y operación
        pedirNumeros();
        pedirOperacion();
    }

    public static void pedirNumeros() {
        while (true) {
            try {
                System.out.println("Ingresa el primer número:");
                num1 = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido");
            }
        }

        while (true) {
            try {
                System.out.println("Ingresa el segundo número:");
                num2 = Integer.parseInt(teclado.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un número válido");
            }
        }
    }

    public static void pedirOperacion() {
        while (true) {
            System.out.println("Ingresa el símbolo de la operación a realizar (+, -, *, /, %): ");
            String simbolo = teclado.nextLine();
            switch (simbolo) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = (float) num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    } else {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        resultado = num1 % num2;
                        System.out.println("El resultado del módulo es: " + resultado);
                    } else {
                        System.out.println("No se puede sacar el módulo de un valor divisible por cero");
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
                    continue;
            }
            break;
        }
    }
}
