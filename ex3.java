package ex3;

import java.util.Scanner;

public class ex3
        {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduceți un număr întreg: ");
            int n = scanner.nextInt();

            if (n <= 1) {
                System.out.println("Numărul trebuie să fie mai mare decât 1.");
            } else {
                boolean estePrim = true;
                System.out.print("Divizorii numărului " + n + " sunt: ");

                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) {
                        System.out.print(i + " ");
                        if (i != 1 && i != n) {
                            estePrim = false;
                        }
                    }
                }

                System.out.println();
                if (estePrim) {
                    System.out.println(n + " este un număr prim.");
                } else {
                    System.out.println(n + " nu este un număr prim.");
                }
            }
            scanner.close();
        }
    }