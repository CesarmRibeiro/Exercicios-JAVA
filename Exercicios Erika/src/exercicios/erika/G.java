package exercicios.erika;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double area , raio , pi;
                System.out.println("Digite o valor do raio");
                 raio = sc.nextDouble();
                    area = 2 * Math.PI * raio;        
                    
                System.out.println("A area e: " + area);    
    }   
    
}