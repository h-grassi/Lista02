package Exercicios;
import Estrutura.No;
import Estrutura.ListaEncadeada;
public class Exercicio4 {
    public void executar() {
        System.out.println("Exercício 4: Inserção no Final");
        System.out.println("Implemente uma função que insira um novo elemento no final da lista.");
        
        ListaEncadeada minhaLista = new ListaEncadeada();
        
        //inserindo o valor zero na lista para prepara-lá para a demonstração:

        for(int i = 0; i< 5; i++){
            minhaLista.inserirInicio(0);
        }

        //exibe a lista com os valores zerados:
        minhaLista.exibirLista();

        //adiciona um valor ao final:
        minhaLista.inserirFinal(1);

        //exibe o resultado final:
        minhaLista.exibirLista();
         System.out.println("-------------------------------");

    }   

}