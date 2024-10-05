package ex2;

import java.io.*;
import java.util.Scanner;

public class ex2
{
    public static void main(String[] args)
    {
        int suma=0,min=10,max=0,ct=0;
        float medie;

        try(Scanner scanner=new Scanner(new File(("C:\\Users\\Larisa\\IdeaProjects\\lab1pj\\src\\ex2\\in.txt"))))
        {
            while(scanner.hasNextInt())
            {
                int nr=scanner.nextInt();
                suma+=nr;
                if(min>nr) min=nr;
                if(max<nr) max=nr;
                ct++;
            }

        }catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

        try
        {
            FileWriter writer=new FileWriter(("C:\\Users\\Larisa\\IdeaProjects\\lab1pj\\src\\ex2\\ex2.txt"));
            writer.write("suma: "+suma+"\n");
            writer.write("valoarea minima: "+min+"\n");
            writer.write("valoarea maxima: "+max+"\n");
            writer.write("media: "+(float)suma/ct+"\n");
            writer.close();
        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
