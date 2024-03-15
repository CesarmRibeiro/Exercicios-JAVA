package exercicios.erika;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double area, base, altura;
                System.out.println("Sistema: Calcular Area do Retangulo");
                System.out.println("Digite a BASE do retangulo em cm");
                 base = in.nextDouble();
                System.out.println("Digite a ALTURA do retangulo em cm");
                 altura = in.nextDouble();
                        
            System.out.println("Resultado");     
            System.out.println("A area do retangulo e de: " + (altura*base));
    }   
    
}