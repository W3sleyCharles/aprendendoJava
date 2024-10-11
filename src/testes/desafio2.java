package testes;
import java.util.Scanner;
public class desafio2 {

    // Metodo "main" onde ocorre a lógica do código
    public static void main (String [] args) {
        
        // Criação do scanner para coletar os dados de entrada do usuário
        Scanner scanner= new Scanner(System.in);

        // Scanner para colocar o nome com o tipo string
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        // Scanner para colocar as vitórias com o tipo int
        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt();

        // Scanner para colocar as derrotas com o tipo int
        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt();

        // Encerrando o Scanner
        scanner.close();

        // Variável que executa e armazena o resultado das váriaveis "vitorias" e "derrota"
        int calculadorDeElo = vitorias - derrotas;

        // Lógica para definir em qual ranking o jogador estaria
        if (calculadorDeElo < 10) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Ferro");
        } else if (calculadorDeElo > 11 && calculadorDeElo < 20) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Bronze");
        } else if (calculadorDeElo > 21 && calculadorDeElo < 50) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Prata");
        } else if (calculadorDeElo > 51 && calculadorDeElo < 80) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Ouro");
        } else if (calculadorDeElo > 81 && calculadorDeElo < 90) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Diamante");
        } else if (calculadorDeElo > 91 && calculadorDeElo < 100) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Lendário");
        } else if (calculadorDeElo > 101) {
            System.out.println (nome +" tem " + vitorias + " vitórias e está no elo Imortal");
        }
        
        
        
        
    }


}

