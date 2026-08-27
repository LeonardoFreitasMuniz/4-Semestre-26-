// Classe ABB para demonstrar a inserção, busca, remoção, atravessamentos etc.
// em uma Árvore Binária de Busca (ABB).
// Profs. Ledón, Amilton Souza Martha.

package testa_abb;

public class Testa_ABB {

    public static void main(String[] args) {
        
        System.out.println("Vamos criar uma ABB com objetos da classe Integer:\n");
        //(vamos gerar a mesma ABB da figura utilizada no Exercício 1 da Aula 04
        ABB abb1 = new ABB();
        System.out.println( "Inserimos " + abb1.inserir(8) );
        System.out.println( "Inserimos " + abb1.inserir(7) );
        System.out.println( "Inserimos " + abb1.inserir(9) );
        System.out.println( "Inserimos " + abb1.inserir(6) );
        System.out.println( "Inserimos " + abb1.inserir(5) );
        System.out.println( "Inserimos " + abb1.inserir(6) );

        System.out.println("\nVamos mostrar a ABB percorrendo em-ordem:\n");
        abb1.emOrdem();
        System.out.println("\n\nVamos mostrar a ABB percorrendo pre-ordem:\n");
        abb1.preOrdem();
        System.out.println("\n\nVamos mostrar a ABB percorrendo pos-ordem:\n");
        abb1.posOrdem();
        System.out.println("\n\nVamos mostrar a ABB percorrendo em nivel:\n");
        abb1.emNivel();
        System.out.println("\n\nO menor valor desta ABB: " + abb1.getMenor( abb1.getRaiz() ) );
        System.out.println("O maior valor desta ABB: " + abb1.getMaior( abb1.getRaiz() ));

    }
    

}
