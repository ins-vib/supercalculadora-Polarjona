package org.yourcompany.calculadora;
import java.util.Scanner;
/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        mostrarMenu();

    }
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; 
        }
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
      
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
      
    }

    public static long calcularPotencia(int base, int exponent) {
        long resultat = 1;
        for (int i = 1; i <= exponent; i++) {
            resultat *= base;
        }
        return resultat;
    }
    
    public static void mostrarMenu() {
            Scanner teclat = new Scanner(System.in);
            int opcio = -1;

            while (opcio != 0) {
                System.out.println("\nMenú:");
                System.out.println("1. Número de xifres");
                System.out.println("2. Sumar fins a n");
                System.out.println("3. Factorial d'un número");
                System.out.println("4. Suma de quadrats");
                System.out.println("5. Potència");
                System.out.println("0. Sortir");
                System.out.print("Entra opció: ");

                opcio = teclat.nextInt();

                switch (opcio) {
                    case 1:
                        System.out.print("Entra número: ");
                        int n1 = teclat.nextInt();
                        int nd = nombreDigits(n1);
                        System.out.println("Resultat: " + nd);
                        break;
                    case 2:
                        System.out.print("Entra n: ");
                        int n2 = teclat.nextInt();
                        int suma = sumaPrimersNumeros(n2);
                        System.out.println("Resultat: " + suma);
                        break;
                    case 3:
                        System.out.print("Entra n: ");
                        int n3 = teclat.nextInt();
                        long fact = calcularFactorial(n3);
                        System.out.println("Resultat: " + fact);
                        break;
                    case 4:
                        System.out.print("Entra n: ");
                        int n4 = teclat.nextInt();
                        int sumaQ = sumaQuadrats(n4);
                        System.out.println("Resultat: " + sumaQ);
                        break;
                    case 5:
                        System.out.print("Entra base: ");
                        int base = teclat.nextInt();
                        System.out.print("Entra exponent: ");
                        int exp = teclat.nextInt();
                        long pot = calcularPotencia(base, exp);
                        System.out.println("Resultat: " + pot);
                        break;
                    case 0:
                        System.out.println("Sortint...");
                        break;
                    default:
                        System.out.println("Opció incorrecta.");
                }
            }

    }
}