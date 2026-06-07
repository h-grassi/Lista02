package Exercicios;
import Estrutura.ListaEncadeada;

public class Exercicio5 {
    public void executar() {
        System.out.println("Exercício 5: Exibir Elementos");
        System.out.println("Crie uma função que percorra a lista simplesmente encadeada e exiba todos os valores armazenados.");
        ListaEncadeada minhaLista = new ListaEncadeada();
        
        for(int i = 0; i< 5; i++){
            minhaLista.inserirFinal(i);
        }

        minhaLista.exibirLista();
        System.out.println("-------------------------------");
    }   

    
}