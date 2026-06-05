package Exercicios;
import Estrutura.No;
import Estrutura.ListaEncadeada;

public class Exercicio5 {
    public void executar() {
        System.out.println("Exercício 1: Exibir Elementos");
        System.out.println("Crie uma função que percorra a lista simplesmente encadeada e exiba todos os valores armazenados.");
        ListaEncadeada minhaLista = new ListaEncadeada();
        
        //inserindo o valor zero na lista para prepara-lá para a demonstração:

        for(int i = 0; i< 5; i++){
            minhaLista.inserirFinal(i);
        }

        minhaLista.exibirLista();
         System.out.println("-------------------------------");
    }   
}