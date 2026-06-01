import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao; 

        System.out.println("--------------------------------");
        System.out.println("Aluno-> Henrique Grassi");
        System.out.println("RA-> 1292514910");
        System.out.println("Curso-> Análise e Desenvolvimento de Sistemas");
        System.out.println("UC-> Matemática Computacional Aplicada");
        System.out.println("--------------------------------");
        System.out.println("O sistema é um menu onde o usuário escolhe qual demonstração deseja executar.");
        System.out.println("Vamos começar!");
        System.out.println("--------------------------------");

        System.out.println("Qual exercício gostaria de realizar?");
        System.out.println("1:  Definição da Estrutura");
        System.out.println("2: Verificar Lista Vazia");
        System.out.println("3: Inserção no Início");
        System.out.println("4: Inserção no Final");
        System.out.println("5: Exibir Elementos");
        System.out.println("6: Buscar um Valor");
        System.out.println("7: Remover do Início");
        System.out.println("8: Remover um Valor Específico");
        System.out.println("9: Contar Elementos");
        System.out.println("10: Inverter a Lista");
        opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1 -> new Exercicio1().executar();
            case 2 -> new Exercicio2().executar(); 
            case 3 -> new Exercicio3().executar(); 
            case 4 -> new Exercicio4().executar(); 
            case 5 -> new Exercicio5().executar(); 
            case 6 -> new Exercicio6().executar(); 
            case 7 -> new Exercicio7().executar(); 
            case 8 -> new Exercicio8().executar(); 
            case 9 -> new Exercicio9().executar(); 
            case 10 -> new Exercicio10().executar(); 

            default -> System.out.println("Opção inválida. Digite um número entre 1 e 10.");
        }

    scanner.close();
    }
}