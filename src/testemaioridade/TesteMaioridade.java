package testemaioridade;

import java.util.Scanner;

/**
 *
 * @author Rayane Maciel
 */
public class TesteMaioridade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.print("Digite sua idade:");
        idade =  input.nextInt();
        
        if(idade>=18){
            System.out.println("Você é Maior de idade");
        }else{
            System.out.println("Você ainda é menor de idade");
    }
    
}
}
