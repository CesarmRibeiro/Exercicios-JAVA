package exercicios.erika;
import java.util.Scanner;

public class B {
     public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double a1 , a2 , a3;
                System.out.println("Sistema: Media do aluno!");
                System.out.println("Digite a nota da A1");
                 a1 = in.nextDouble();
                System.out.println("Digite a nota da A2");
                 a2 = in.nextDouble();
                System.out.println("Digite a nota da A3");
                 a3 = in.nextDouble();
                
        System.out.println("Resultado");     
        System.out.println("Multiplicando os 3 numeros inseridos teremos:" + ((a1*3) + (a2*3) + (a3*4))/ 10);
    }   
    
}
