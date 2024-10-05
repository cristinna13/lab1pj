package ex5;

import java.util.Random;

public class ex5
    {
    public static void main(String[] args) {
        Random random = new Random();

        // Generarea unui număr aleatoriu între 0 și 20
        int numar = random.nextInt(21);
        System.out.println("Numărul generat: " + numar);

        // Verificarea dacă numărul aparține șirului lui Fibonacci
        if (numar == 0 || numar == 1)
        {
            System.out.println(numar + " aparține șirului lui Fibonacci.");
        }
        else
        {
            int a = 0;
            int b = 1;
            int fib = a + b;

            while (fib < numar) {
                a = b;
                b = fib;
                fib = a + b;
            }

            if (fib == numar) {
                System.out.println(numar + " aparține șirului lui Fibonacci.");
            } else {
                System.out.println(numar + " nu aparține șirului lui Fibonacci.");
            }
        }
    }
}
