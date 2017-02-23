
package projetopraia;

import java.util.Scanner;

public class ProjetoPraiaManha {

    public static void main(String[] args) {
        /*
        //criando um objeto da 
        //classe Crianca:
        Crianca c1 = new Crianca();
        //modificando os atributos
        //através do objeto:
        c1.corCabelo = "preto";
        c1.corPele   = "amarelo";
        c1.altura    = 1.35;
        c1.idade     = 5;
        //chamando métodos da classe Crianca:
        c1.brincar();
        c1.correr( 0.73 );
        c1.nadar( 0.015 );
        System.out.println( c1.sorrir() );
        
        c1.imprimirAtributos();
        
        //criando um outro objeto 
        //da classe Crianca
        Crianca c2 = new Crianca();
        c2.altura = 1.27;
        c2.corCabelo = "ruivo";
        c2.corPele = "branca";
        c2.idade = 4;
        
        System.out.println("##############");
        c2.imprimirAtributos();
        */
        
        Pessoa p1 = new Pessoa();
        
        Pessoa p2 = new Pessoa("Paulo", 
                "981.091.894-91");
        
        p1.setNome( "Maria" );
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite CPF: ");
        String cpfDigitado = sc.nextLine();
        p1.setCpf( cpfDigitado );
        p2.setCpf( "777.777.777-77" );
        
        System.out.println( "Nome p1: " + 
                p1.getNome() );
        System.out.println( "Nome p2: " + 
                p2.getNome() );
        System.out.println( "CPF p1: " + 
                p1.getCpf() );
        System.out.println( "CPF p2: " + 
                p2.getCpf() );
        
    } //fim do main()
    
}
