package Exercicios;
import Estrutura.ListaEncadeada;

public class Exercicio7 {
    public void executar() {
        System.out.println("Exercício 7: Remover do Início");
        System.out.println("Crie uma função que remova o primeiro elemento da lista e ajuste os ponteiros corretamente.");
        ListaEncadeada minhaLista = new ListaEncadeada();
        
        for(int i = 0; i< 5; i++){
            minhaLista.inserirFinal(i);
        }

        minhaLista.exibirLista();

        minhaLista.removerNoInicio();
        System.out.println("Lista após a remoção do primeiro elemento:");
        minhaLista.exibirLista();
        System.out.println("-------------------------------");
    }   
}