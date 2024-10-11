package testes;
import java.util.Scanner;

public class desafio1 { 

    // Metodo "main" onde ocorre a lógica do código
    public static void main(String[] args) {
 
        // Criação do scanner para coletar os dados de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Scanner para colocar o nome com o tipo string
        System.out.print("Digite o nome do personagem: ");
        String nome = scanner.nextLine();

        // Scanner para colocar a classe com o tipo string
        System.out.print("Digite a classe do personagem: ");
        String classe = scanner.nextLine();

        // Scanner para colocar a experiência com o tipo int
        System.out.print("Digite a quantidade de experiência o personagem adquiriu: ");
        int exp = scanner.nextInt();

        // Encerrando o Scanner
        scanner.close();

        // Lógica para definir em qual nível o jogador estaria 
        if (exp < 1000) {
            System.out.println (nome + " o " + classe + " está no nível Ferro");
        } else if (exp > 1001 && exp < 2000) {
            System.out.println(nome + " o " + classe + " está no nível Bronze");
        } else if (exp > 2001 && exp < 5000) {
            System.out.println(nome + " o " + classe + " está no nível Prata");
        } else if (exp > 5001 && exp < 7000) {
            System.out.println(nome + " o " + classe + " está no nível Ouro");
        } else if (exp > 7001 && exp < 8000) {
            System.out.println(nome + " o " + classe + " está no nível Platina");
        } else if (exp > 8001 && exp < 9000) {
            System.out.println(nome + " o " + classe + " está no nível Ascendente");
        } else if (exp > 9001 && exp < 10000) {
            System.out.println(nome + " o " + classe + " está no nível Imortal");
        } else if (exp >= 10001) {
            System.out.println(nome + " o " + classe + " está no nível Radiante");
        }


    }   


}