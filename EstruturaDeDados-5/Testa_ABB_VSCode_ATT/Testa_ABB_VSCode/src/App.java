// Classe ABB para demonstrar a inserção e o atravessamento em-ordem 
// em uma Árvore Binária de Busca (ABB)
// Ledón, 2026.

public class App {

    public static void main(String[] args) {

        System.out.println("\n=== EXERCÍCIO PRÁTICO 1: os quatro atravessamentos em uma ABB qualquer ===");

        //CRIA UMA ABB E INSERE OS MESMOS VALORES DA ÁRVORE MOSTRADA NO SLIDE DO EXERCÍCIO 1
        ABB abb1 = new ABB();
        abb1.inserir(12);
        abb1.inserir(6);
        abb1.inserir(15);
        abb1.inserir(4);
        abb1.inserir(7);
        abb1.inserir(13);

        System.out.println("\nPré-ordem: ");
        abb1.preOrdem();

        System.out.println("\n\nEm-ordem: ");
        abb1.emOrdem();

        System.out.println("\n\nPós-ordem: ");
        abb1.posOrdem();

        System.out.println("\n\nEm nível: ");
        abb1.emNivel();

        System.out.println("\n\n\n=== EXERCÍCIO PRÁTICO 2: Alunos ordenados por nome ===");

        //CRIA UMA ABB DE ALUNOS; A ORDEM DE INSERÇÃO AGORA SEGUE O 'NOME' (COMPARETO ALTERADO EM ALUNO.JAVA)
        ABB abb2 = new ABB();
        abb2.inserir(new Aluno("999-9", "Ana", 'F', 9.5f));
        abb2.inserir(new Aluno("111-1", "Luiz", 'M', 6.5f));
        abb2.inserir(new Aluno("444-4", "Betty", 'F', 9.0f));
        abb2.inserir(new Aluno("888-8", "Caio", 'M', 5.5f));
        abb2.inserir(new Aluno("333-3", "Lara", 'F', 7.8f));

        System.out.println("\nAlunos em ordem crescente pelo nome (percurso em-ordem):");
        //O PERCURSO EM-ORDEM É O ADEQUADO AQUI, POIS EM UMA ABB ELE VISITA OS NÓS JÁ NA ORDEM DEFINIDA PELO COMPARETO
        abb2.emOrdem2();

        System.out.println("\n\n\n");
    }
}
