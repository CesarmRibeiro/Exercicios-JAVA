package exercicios.erika;
import java.util.Scanner;

public class C {
     public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double salario , aumento = 1.25;
                System.out.println("Sistema: Aumento salarial!");
                System.out.println("Digite seu salario");
                    salario = in.nextDouble();                                            
                 System.out.println("Resultado");     
                 System.out.println("Seu salario com o aumento sera de: " + (salario*aumento));
    }   
    
}

