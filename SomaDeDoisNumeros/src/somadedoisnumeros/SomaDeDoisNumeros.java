package somadedoisnumeros;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class SomaDeDoisNumeros {

    public static void main(String[] args) {

        // Cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner(System.in);
        
        // Criação das três variáveis
        int num1, num2, soma;
        
        // Lê o primeiro número fornecido pelo usuário
        System.out.println("Digite o primeiro número");
        num1 = input.nextInt();
        
        // Lê o segundo número fornecido pelo usuário
        System.out.println("Digite o segundo número");
        num2 = input.nextInt();
        
        // Soma os números e armazena o total em soma
        soma = num1 + num2; 
        
        // Exibe o resultado da soma
        System.out.println("O resultado é " + soma);
        

    }

}
