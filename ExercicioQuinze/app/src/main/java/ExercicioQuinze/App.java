
package ExercicioQuinze;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        int numero;
                
                Scanner leitorScanner = new Scanner(System.in);
                System.out.println("Escreva Carai");
                
                numero = leitorScanner.nextInt();
                        
                        if(numero >= 100 && numero <= 200){
                            System.out.println("O numero ta no intervalo carai");
                            
                        }else{
                            System.out.println("AAAAAAAAAAAAAi Miguel");
                        }
                        
    }
}
