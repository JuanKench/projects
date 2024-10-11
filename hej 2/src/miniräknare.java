import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class miniräknare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("skriv in det du vill räkna ut så länge du bara använder +, -, *, eller /");
            double calculator = scan.nextDouble();
            char symbolreader = scan.next().charAt(0);
            double calculator2 = scan.nextDouble();
            double result;
            // det är jobbigt att använda for loop jag provar switch
            // går det att använda en for loop?
            // while måste ju vara omöjligt
            switch (symbolreader) {
                case '+':
                    result = calculator + calculator2;
                    System.out.println("Resultat: " + calculator + " + " + calculator2 + " = " + result);
                    break;
                case '-':
                    result = calculator - calculator2;
                    System.out.println("Resultat " + calculator + " - " + calculator2 + " = " + result);
                    break;
                case '*':
                    result = calculator * calculator2;
                    System.out.println("resultat " + calculator + " * " + calculator2 + " = " + result);
                    break;
                case '/':
                    if (calculator2 != 0) {
                        result = calculator / calculator2;
                        System.out.println("Resultat " + calculator + " / " + calculator2 + " = " + result);
                    } else {
                        System.out.println("whomp whomp det är väldigt svårt att dela med 0 inte säker på vad som händer när man gör det så tyvär får du inte göra det men när jag listar ut hur man gör kanske det ändras C:");
                    }
                    break;
                default:
                    System.out.println("fel operator tror jag");
            }
        }
        catch (InputMismatchException e){
            System.err.println("du måste skriva någonting");
        }

        finally{
            scan.close();
        }
        }
        }
        // förlåt för att jag missade inlämnings datumet hoppas att koden fungerar bara.