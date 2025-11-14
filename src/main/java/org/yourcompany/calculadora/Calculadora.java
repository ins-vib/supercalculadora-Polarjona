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

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té el nombre
     */
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

    /**
     * Calcula la suma dels primers límit nombres naturals positius.
     * 
     * @param limit Valor fins al qual es vol fer la suma (inclòs)
     * @return Resultat de la suma 1 + 2 + ... + limit
     */
    public static int sumaPrimersNumeros(int limit) {
        int suma = 0;
        for (int i = 1; i <= limit; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Calcula el factorial d’un número enter no negatiu.
     * 
     * @param valorFactorial Número del qual es vol calcular el factorial
     * @return Factorial del número indicat
     */
    public static long calcularFactorial(int valorFactorial) {
        long factorial = 1;
        for (int i = 2; i <= valorFactorial; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Calcula la suma dels quadrats dels primers total nombres naturals.
     *
     * @param total Quantitat de nombres a considerar
     * @return Resultat de la suma 1² + 2² + ... + total²
     */
    public static int sumaQuadrats(int total) {
        int suma = 0;
        for (int i = 1; i <= total; i++) {
            suma += i * i;
        }
        return suma;
    }

    /**
     * Calcula la potència d’un número enter elevat a un exponent positiu.
     * 
     * @param basePot Base de la potència
     * @param exponentPot Valor de l’exponent
     * @return Resultat de basePot elevat a exponentPot
     */
    public static long calcularPotencia(int basePot, int exponentPot) {
        long resultat = 1;
        for (int i = 1; i <= exponentPot; i++) {
            resultat *= basePot;
        }
        return resultat;
    }

    /**
     * Mostra el menú principal de l’aplicació i permet a l’usuari 
     * triar l’operació a realitzar fins que es demani sortir.
     */
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
                    int valorNombre = teclat.nextInt();
                    int nd = nombreDigits(valorNombre);
                    System.out.println("Resultat: " + nd);
                    break;
                case 2:
                    System.out.print("Entra límit: ");
                    int limit = teclat.nextInt();
                    int suma = sumaPrimersNumeros(limit);
                    System.out.println("Resultat: " + suma);
                    break;
                case 3:
                    System.out.print("Entra per factorial: ");
                    int valorFactorial = teclat.nextInt();
                    long fact = calcularFactorial(valorFactorial);
                    System.out.println("Resultat: " + fact);
                    break;
                case 4:
                    System.out.print("Entra total per quadrats: ");
                    int total = teclat.nextInt();
                    int sumaQ = sumaQuadrats(total);
                    System.out.println("Resultat: " + sumaQ);
                    break;
                case 5:
                    System.out.print("Entra base: ");
                    int basePot = teclat.nextInt();
                    System.out.print("Entra exponent: ");
                    int exponentPot = teclat.nextInt();
                    long pot = calcularPotencia(basePot, exponentPot);
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