import java.util.Scanner;
public class funzioni3 
{
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in);

    while (true)
    {
        System.out.println("Scrivi quanti televisori vuoi comprare");
        int televisori = scanner.nextInt();   
            if(televisori < 0)
            {
                System.out.println("Errore. ");
                break;
            }
            else
            {
                System.out.println("Ottimo vuoi comprare: " + televisori + " televisori. ");
            }
        
        System.out.println("Scrivi quanti frigoriferi vuoi comprare?");
        int frigoriferi = scanner.nextInt();
            if(frigoriferi < 0)
            {
                System.out.println("Errore. ");
                break;
            }
            else
            {
                System.out.println("Ottimo vuoi comprare: " + frigoriferi + " frigoriferi. ");
            }
        
        System.out.println("Scrivi quante lavatrici vuoi comprare?");;
        int lavatrici = scanner.nextInt();
            if(lavatrici < 0)
            {
                System.out.println("Errore. ");
                break;
            }
            else
            {
                System.out.println("Ottimo vuoi comprare: " + lavatrici + " lavatrici. ");
            }
            
        System.out.println("Scrivi quanti altri oggetti vuoi comprare. ");    
        int altro = scanner.nextInt();
            if(lavatrici < 0)
            {
                System.out.println("Errore. ");
                break;
            }
            else
            {
                System.out.println("Ottimo vuoi comprare: " + altro + " altri oggetti. ");
            }
            int totale = contaPrezzo(televisori, frigoriferi, lavatrici, altro);
            System.out.println("Il prezzo totale per i tuoi acquisti è: " + totale + " euro.");
            break;
        }

    }
    public static int contaPrezzo(int televisori, int frigoriferi, int lavatrici, int altro) 
    {
        int prezzotelevisori = 650;                
        int prezzolavatrici = 150;      
        int prezzofrigoriferi = 300; 
        int prezzoaltro = 50;     
        
        int totale = (televisori * prezzotelevisori) + (frigoriferi * prezzofrigoriferi) + (lavatrici * prezzolavatrici) + (altro * prezzoaltro);
                     
        return totale;
    }
}
