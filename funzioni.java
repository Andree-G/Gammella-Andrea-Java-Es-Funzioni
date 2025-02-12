import java.util.Scanner;
public class funzioni
{
	public static void main(String[] args)  
    { Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una serie di numeri POSITIVI");
        
        while (true)
        {
            int numeri = scanner.nextInt();

            if (numeri < 0)
            {
                System.out.println("Il valore non è valido. ");
                break;
            }
            if (NumeroPariDispari(numeri))
            {   
                System.out.println(numeri);
            }
            else
            {
                System.out.println(numeri);
            }
        }
    }
    public static boolean NumeroPariDispari(int numeri)
    {   
            for(int i = 1; i <= numeri; i++)
            {   
                if (i % 2 == 0)
                {
                    System.out.println("*");
                    System.out.println(numeri);
                }
                else
                {
                    System.out.println("#");
                    System.out.println(numeri);
                }
            }       
    }
}     


