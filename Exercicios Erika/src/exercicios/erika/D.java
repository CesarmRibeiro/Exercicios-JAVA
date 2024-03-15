 package exercicios.erika;
import java.util.Scanner;

public class D{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double salario, aumento = 0.05 , imposto = 0.07;
                System.out.println("Sistema: Reajuste Salarial");
                System.out.println("Digite o seu salario");
                salario = in.nextDouble();
                    aumento = salario * aumento;
                    imposto = salario * imposto;
                    salario = salario + aumento - imposto;
                        
        System.out.println("Resultado");     
        System.out.println("Com reajuste seu salario passou a ser: " + salario);
        System.out.println("Gratificacao: " + aumento);
        System.out.println("Imposto: " + imposto);
    }   
    
}

