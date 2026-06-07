package Exercicios;

import Estrutura.No;
import Estrutura.ListaEncadeada;

public class Exercicio2 {
    public void executar() {
        System.out.println("Exercício 2:Verificar Lista Vazia");
        System.out.println("Crie uma função que verifique se uma lista simplesmente encadeada está vazia.");
        
        ListaEncadeada minhaLista = new ListaEncadeada();

        // Teste 1: A lista acabou de ser criada
        System.out.println("A lista está vazia? " + minhaLista.estaVazia()); // Saída: true

        // Adicionando um elemento manualmente na cabeça da lista
        minhaLista.cabeca = new No(10);

        // Teste 2: A lista agora tem um elemento
        System.out.println("A lista está vazia agora? " + minhaLista.estaVazia());
         System.out.println("-------------------------------");
        
    }   
}