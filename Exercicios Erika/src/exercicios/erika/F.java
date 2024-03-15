package exercicios.erika;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double area , base , altura;
                System.out.println("Sistema: Calcular Area do Triangulo");
                System.out.println("Digite a BASE do triangulo");
                 base = in.nextDouble();
                System.out.println("Digite a Alutra do triangulo");
                 altura = in.nextDouble();
                    System.out.println("Resultado");     
                    System.out.println("A area do Triangulo é: " + (altura*base)/2);
    }   
    
}
