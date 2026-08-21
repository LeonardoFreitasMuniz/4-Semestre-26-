// Classe ABB para demonstrar a inserção e o atravessamento em-ordem 
// em uma Árvore Binária de Busca (ABB)
// Ledón, 2026.

public class App {

    public static void main(String[] args) {
         System.out.println("\nCriamos arvores com objetos, para testar os metodos 'inserir' e 'add'  ");
                
        System.out.println("\nVamos criar uma ABB com objetos da classe Integer:");
        ABB abb1 = new ABB();
        System.out.println( "Inserimos " + abb1.inserir(12) );
        System.out.println( "Inserimos " + abb1.inserir(6) );
        System.out.println( "Inserimos " + abb1.inserir(4) );
        System.out.println( "Inserimos " + abb1.inserir(15) );
        System.out.println( "Inserimos " + abb1.inserir(13) );
        System.out.println( "Inserimos " + abb1.inserir(25) );
        System.out.println( "Inserimos " + abb1.inserir(2) );
        System.out.println( "Inserimos " + abb1.inserir(5) );
        
        System.out.println("\nVamos mostrar a ABB percorrendo em-ordem:");
        abb1.emOrdem();

        //EXERCICIO 1:
        System.out.println("\n\nMesma ABB percorrendo em pré-ordem:");
        abb1.preOrdem();
        System.out.println("\n\nMesma ABB percorrendo em pós-ordem:");
        abb1.posOrdem();
        System.out.println("\n\nMesma ABB percorrendo em nível:");
        abb1.emNivel();
        
        System.out.println("\n\nAgora vamos criar uma ABB (e percorrer em-ordem pelos nomes) de objetos da classe Aluno:");
        ABB abb2 = new ABB();
        abb2.inserir(new Aluno("999-9", "Ana", 'F', 9.5f));
        abb2.inserir(new Aluno("111-1", "Luiz", 'M', 6.5f));
        abb2.inserir(new Aluno("444-4", "Betty", 'F', 9.0f));
        abb2.inserir(new Aluno("888-8", "Caio", 'M', 5.5f));
        abb2.inserir(new Aluno("333-3", "Lara", 'F', 7.8f));
        abb2.emOrdem2();       
        
        //Utilizamos agora a segunda versão do método: add
        System.out.println("\nSegunda versao do método (ADD)");
        System.out.println("\nVamos criar uma ABB com objetos da classe Integer:");
        ABB abb3 = new ABB();
        System.out.println( "Inserimos " + abb3.add(12) );
        System.out.println( "Inserimos " + abb3.add(6) );
        System.out.println( "Inserimos " + abb3.add(4) );
        System.out.println( "Inserimos " + abb3.add(15) );
        System.out.println( "Inserimos " + abb3.add(13) );
        System.out.println( "Inserimos " + abb3.add(25) );
        System.out.println( "Inserimos " + abb3.add(2) );
        System.out.println( "Inserimos " + abb3.add(5) );
        
        System.out.println("\nVamos mostrar a ABB percorrendo em-ordem:");
        abb3.emOrdem();
        
        System.out.println("\n\nAgora vamos criar uma ABB (e percorrer em-ordem pelos nomes) de objetos da classe Aluno:");
        ABB abb4 = new ABB();
        abb4.add(new Aluno("999-9", "Ana", 'F', 9.5f));
        abb4.add(new Aluno("111-1", "Luiz", 'M', 6.5f));
        abb4.add(new Aluno("444-4", "Betty", 'F', 9.0f));
        abb4.add(new Aluno("888-8", "Caio", 'M', 5.5f));
        abb4.add(new Aluno("333-3", "Lara", 'F', 7.8f));
        abb4.emOrdem2();       
        
        System.out.println("\n\n\n");
    }
}
