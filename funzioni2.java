import java.util.Scanner;
public class funzioni2 
{
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Scrivi un tempo compreso tra 0 e 84600. ");
            
            int tempo = scanner.nextInt();
            
            if (tempo < 0 || tempo > 84600)
            {
                System.out.println("Devi darmi un valore compreso tra 0 e 84600 capito?? ");
            }
            else
            {
                System.out.println("Perfetto, questo numero va benissimo! ");
                convertiSecondi(tempo);
                break;
            } 
        }
    
    }
    public static void convertiSecondi(int secondi) 
    {
        int ore = secondi / 3600;                
        int minuti = (secondi % 3600) / 60;      
        int secondiRestanti = secondi % 60;      
    
        System.out.println(ore + " ore, " + minuti + " minuti, " + secondiRestanti + " secondi");
    }
}
