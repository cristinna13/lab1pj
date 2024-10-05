package ex1;

import java.util.Scanner;

public class ex1
{
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);

                System.out.println("dati lungimea dreptunghiului= ");
                double lungime=scanner.nextDouble();

                System.out.println("dati lungime triunghiului= ");
                double latime=scanner.nextDouble();

                double perimetru=2*(lungime+latime);
                double arie=lungime*latime;

                System.out.println("perimetrul este= " +perimetru);
                System.out.println("aria este= "+arie);
    }
}
