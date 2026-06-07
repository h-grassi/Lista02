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

    public int contarElementos(){
        int contador = 0;
        if(estaVazia()){
            return contador;
        }else{
            No atual = this.cabeca;
            while (atual != null){
                contador ++;
                atual = atual.proximo;
            }
            
        }
        return contador;
    }

    public int procuraValor(int valor){
        int qtdElementos = contarElementos();
        int retorno = 0;

        No atual = this.cabeca;
        for(int i = 0; i<= qtdElementos; i++){
            if (atual.valor == valor){
                i = qtdElementos;
                retorno = 1;
            }else{
                if(atual.proximo == null){
                    i = qtdElementos;
                    retorno = 0;
                }else{
                atual = atual.proximo;
                }
            }
        }
        return retorno;
    }

    public void removerNoInicio() {
        if (estaVazia()) {
            System.out.println("A lista já está vazia. Não há o que remover.");
            return; // Sai do método
        }

        this.cabeca = this.cabeca.proximo;
    }

    public void removerEspecifico(int valorParaRemover) {
        if (estaVazia()) {
            System.out.println("A lista está vazia. Impossível remover o valor " + valorParaRemover);
            return;
        }

        if (this.cabeca.valor == valorParaRemover) {
            this.cabeca = this.cabeca.proximo; // Removemos atualizando a cabeça
            return;
        }

        No atual = this.cabeca;
        No anterior = null;

        while (atual != null && atual.valor != valorParaRemover) {
            anterior = atual;       // O anterior guarda o nó atual
            atual = atual.proximo;  // O atual dá um passo para frente
        }

        // Se o 'atual' chegou a null, significa que olhamos tudo e não achamos o valor
        if (atual == null) {
            System.out.println("O elemento " + valorParaRemover + " não foi encontrado na lista.");
            return;
        }

        anterior.proximo = atual.proximo;
    }

    public void inverter() {
    // Se a lista estiver vazia ou tiver apenas um elemento, não há o que inverter
    if (estaVazia() || this.cabeca.proximo == null) {
        return; 
    }

    No anterior = null;
    No atual = this.cabeca;
    No proximoTemp = null;

    //busca o ultimo elemento da lista
    while (atual != null) {
        // guarda valores em lista temporaria
        proximoTemp = atual.proximo;
        
        //O atual passa a apontar para o nó de trás
        atual.proximo = anterior;
        
        //Realiza a troca de valores
        anterior = atual;     
        atual = proximoTemp;  

        // grava a troca de valores
        this.cabeca = anterior;
        }
    }
}
    