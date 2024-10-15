package desafios;
public class personagem {
    private String nome;
    private int idade;
    private String classe;

    public personagem(String nome, int idade, String classe) {
        this.nome = nome;
        this.idade = idade;
        this.classe = classe;
    }

    public void atacar() { 
    String ataque = classe;

        switch (ataque) {
            
            case "mago":
                ataque = "conjurou uma bola de fogo";
                break;

            case "guerreiro":
                ataque = "golpeou com a espada";
                break;

            case "arqueiro":
                ataque = "disparou uma flecha";
                break;

            case "monge":
                ataque = "usou artes marciais";
                break;

            case "ninja":
                ataque = "lançou uma shuriken";
                break;
        }
        System.out.println(this.nome + " " + ataque);
    }

}
