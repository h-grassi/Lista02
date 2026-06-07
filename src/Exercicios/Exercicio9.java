package Exercicios;
import Estrutura.ListaEncadeada;

public class Exercicio9 {
    public void executar() {
        System.out.println("Exercício 9: Contar Elementos");
        System.out.println("Crie uma função que retorne a quantidade de elementos presentes na lista.");
        
        ListaEncadeada minhaLista = new ListaEncadeada();
        for(int i = 0; i< 10; i++){
            minhaLista.inserirFinal(i);
        }
        minhaLista.exibirLista();
        System.out.println("Quantidade de elementos na lista: " + minhaLista.contarElementos());
         System.out.println("-------------------------------");

    }   
}