package exercicios.erika;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double num1 , num2 , num3;
                System.out.println("Sistema: Multiplicar 3 Numeros");
                System.out.println("Digite o Primeiro numero");
                 num1 = in.nextDouble();
                System.out.println("Digite o Segundo numero");
                 num2 = in.nextDouble();
                System.out.println("Digite o Terceiro numero");
                 num3 = in.nextDouble();
                        
        System.out.println("Resultado");     
        System.out.println("Multiplicando os 3 numeros inseridos teremos:" + num1 * num2 * num3);
    }   
    
}
