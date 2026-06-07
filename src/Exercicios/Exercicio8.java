package Exercicios;
import Estrutura.ListaEncadeada;

public class Exercicio8 {
    public void executar() {
        System.out.println("Exercício 8: Remover um Valor Específico");
        System.out.println("Implemente uma função que remova a primeira ocorrência de um valor informado da lista simplesmente encadeada.");
        ListaEncadeada minhaLista = new ListaEncadeada();
        
        for(int i = 0; i< 5; i++){
            minhaLista.inserirFinal(i);
        }
        minhaLista.exibirLista();

        System.out.println("Remover o elemento 3 da lista:");
        minhaLista.removerEspecifico(3);
        minhaLista.exibirLista();

        System.out.println("Teste remover elemento que não existe (9):");
        minhaLista.removerEspecifico(9);
        System.out.println("-------------------------------");
    }   
}