package Exercicios;
import Estrutura.No;
import Estrutura.ListaEncadeada;

public class Exercicio1 {
    public void executar() {
        System.out.println("Exercício 1: Definição da Estrutura");
        System.out.println("Implemente a estrutura de um nó para uma lista simplesmente encadeada. O nó deve conter um valor inteiro e um ponteiro (ou referência) para o próximo nó da lista.");
        // 1. Criando os 5 nós individualmente
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);

        // 2. Conectando os nós para formar a lista encadeada
        no1.proximo = no2; // 1 aponta para 2
        no2.proximo = no3; // 2 aponta para 3
        no3.proximo = no4; // 3 aponta para 4
        no4.proximo = no5; // 4 aponta para 5
        // O proximo de no5 continua sendo null, indicando o fim da lista

        // 3. Percorrendo (iterando) e imprimindo a lista
        No atual = no1; 
        
        System.out.print("Elementos da lista: ");
        
        // O loop continua enquanto não chegarmos ao final (null)
        while (atual != null) {
            System.out.print(atual.valor);
            
            // Adiciona uma setinha apenas para visualização, se não for o último
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            
            // Avança para o próximo nó da lista
            atual = atual.proximo;
        }
         System.out.println("-------------------------------");
    }   
}