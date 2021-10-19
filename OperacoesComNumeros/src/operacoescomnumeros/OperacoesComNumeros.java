package operacoescomnumeros;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class OperacoesComNumeros {
    
   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2; // Variaveis para os números
        int soma, subt, div, mult; //variaveis para as operações
        
        // Solicitando os números para o usuário e os armazenando nas variaveis
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();
        
        // Especificando o que cada variável faz
        soma = n1 + n2;
        subt = n1 - n2;
        div = n1 / n2;
        mult = n1 * n2;
       
        
        // Mostrando para o usuário
        System.out.println("A Soma é: " + soma);
        System.out.println("A subtração é: " + subt);
        System.out.println("A divisão é: " + div);
        System.out.println("A multiplicação é: " + mult);
              
        
        
    }
    
}
