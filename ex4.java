package ex4;

import java.util.Random;

public class ex4
    {
        public static void main(String[] args) {
            Random random = new Random();

            // Generarea a două numere aleatorii între 1 și 30
            int numar1 = random.nextInt(30) + 1;
            int numar2 = random.nextInt(30) + 1;

            System.out.println("Numărul 1: " + numar1);
            System.out.println("Numărul 2: " + numar2);

            int cmmdc = calculareCMMDC(numar1, numar2);
            System.out.println("CMMDC-ul dintre " + numar1 + " și " + numar2 + " este: " + cmmdc);
        }

        // calcularea CMMDC
        public static int calculareCMMDC(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
