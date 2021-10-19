package idadeemdias;

import java.util.Scanner;

/**
 *
 * @author Gustavo Picoli
 */
public class IdadeEmDias {

   
    public static void main(String[] args) {
        
        int anos, meses, dias;
        int idadeEmDias; // Camel Case
        
        Scanner leitor = new Scanner(System.in); // classe do java para eu ter acesso ao teclado do usuário
        System.out.println("Digite a idade em anos: ");
        anos = leitor.nextInt();        
        System.out.println("Digite a idade em meses: ");
        meses = leitor.nextInt();
        System.out.println("Digite a idade em dias: ");
        dias = leitor.nextInt();         
              
        
        idadeEmDias = anos * 365 + meses * 30 + dias;
        System.out.println("Idade em dias: " + idadeEmDias);
        
        
        
    }
    
}
