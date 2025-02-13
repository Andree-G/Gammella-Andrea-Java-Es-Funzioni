import java.util.Scanner;
public class funzioni
{
	public static void main(String[] args)  
    { Scanner scanner = new Scanner(System.in);
        
        while (true)
        {
            System.out.println("Scrivi una serie di numeri POSITIVI");
            System.out.println("Scrivi FINE per uscire dal programma. ");
            int numeri = scanner.nextInt();

            if (numeri < 0)
            {
                System.out.println("Il valore non è valido. ");
                break;
            }
            
            NumeroPariDispari(numeri); 
        }
            String parola = scanner.nextLine();
            if (parola.equalsIgnoreCase("fine"));
                {
                    System.out.println("Stai uscendo dal programma ;)");
                }
    }
    public static void NumeroPariDispari(int numeri)
    {   
        if (numeri % 2 == 0) 
        {
            for (int i = 1; i <= numeri; i++) 
            {
                System.out.print(" * ");
            }
        } 
        else 
        { 
            for (int i = 1; i <= numeri; i++) 
            {
                System.out.print(" # ");
            }
        }
}
}     


