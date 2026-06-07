package Exercicios;
import Estrutura.ListaEncadeada;

public class Exercicio6 {
    public void executar() {
        System.out.println("Exercício 6: Buscar um Valor");
        System.out.println("Implemente uma função que procure um valor informado pelo usuário e indique se ele está ou não presente na lista.");
        ListaEncadeada minhaLista = new ListaEncadeada();

        int verificaValor=0;
        //inserindo itens na lista
        for(int i = 0; i< 5; i++){
            minhaLista.inserirFinal(i);
        }
        System.out.println("Lista de exemplo:");
        minhaLista.exibirLista();

        //busca pelo valor 3(existe)
        System.out.println("Verifica se existe o valor 3 na lista:");
        verificaValor = minhaLista.procuraValor(3);
        if (verificaValor == 0){
            System.out.println("Valor informado pelo usuário não existe");
        }else{
            System.out.println("Valor informado pelo usuário existe");
        }
        //busca pelo valor 9 (não existe)
        System.out.println("Verifica se existe o valor 9 na lista:");
        verificaValor = minhaLista.procuraValor(9);
        if (verificaValor == 0){
            System.out.println("Valor informado pelo usuário não existe");
        }else{
            System.out.println("Valor informado pelo usuário existe");
        }
        System.out.println("-------------------------------");
    }   
}