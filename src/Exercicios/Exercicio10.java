package Exercicios;
import Estrutura.ListaEncadeada;

public class Exercicio10 {
    public void executar() {
        System.out.println("Exercício 10: Inverter a Lista");
        System.out.println("Implemente uma função que inverta a ordem dos elementos da lista simplesmente encadeada sem utilizar uma lista auxiliar.");
        ListaEncadeada minhaLista = new ListaEncadeada();
        
        for(int i = 0; i< 5; i++){
            minhaLista.inserirFinal(i);
        }

        System.out.println("Lista original:");
        minhaLista.exibirLista();
        System.out.println("Lista invertida:");
        minhaLista.inverter();
        minhaLista.exibirLista();
        System.out.println("-------------------------------");
    }   
}