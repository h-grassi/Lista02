package Estrutura;

public class ListaEncadeada {
    public No cabeca; // Ponto de partida da lista

    // Construtor: uma lista nova sempre começa vazia
    public ListaEncadeada() {
        this.cabeca = null;
    }
    public void inserirInicio(int valor){
        No novoNo = new No(valor);
    
        // O novo nó aponta para onde a cabeça aponta atualmente
        novoNo.proximo = this.cabeca; 
        
        // A cabeça muda de lugar e passa a ser o novo nó
        this.cabeca = novoNo;
    }

    public void inserirFinal(int valor){
        No novoNo = new No(valor);

        // Cenário 1: A lista está vazia
        if (estaVazia()) {
            this.cabeca = novoNo;
            return; // Finaliza o método aqui
        }

        // Cenário 2: A lista já tem elementos
        No atual = this.cabeca;
        
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        // Agora que 'atual' é o último nó, conectamos ele ao novo nó
        atual.proximo = novoNo;
    }

    
    // Função para verificar se a lista está vazia
    public boolean estaVazia() {
        // Retorna true se a cabeça for null, e false caso contrário
        return this.cabeca == null;
    }

    public void exibirLista(){
        if(estaVazia()){
            System.out.println("A lista está vazia.");
        }else{
            No atual = this.cabeca;
            System.out.print("[");

            while (atual != null){
                System.out.print(atual.valor);
                if(atual.proximo != null){
                    System.out.print(", ");
                }
                atual = atual.proximo;
            }
            System.out.print("]\n");
        }
    }
}
    