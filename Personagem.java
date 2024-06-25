// Definição da classe Personagem
public class Personagem {
    // Atributos da classe Personagem
    private String nome;     // Nome do personagem
    private int idade;       // Idade do personagem
    private String formacao; // Formação do personagem

    // Construtor da classe Personagem
    public Personagem(String nome, int idade, String formacao) {
        this.nome = nome;         // Inicializa o nome do personagem
        this.idade = idade;       // Inicializa a idade do personagem
        this.formacao = formacao; // Inicializa a formação do personagem
    }

    // Método para obter o nome do personagem
    public String getNome() {
        return nome; // Retorna o nome do personagem
    }

    // Método para obter a idade do personagem
    public int getIdade() {
        return idade; // Retorna a idade do personagem
    }

    // Método para obter a formação do personagem
    public String getFormacao() {
        return formacao; // Retorna a formação do personagem
    }

    // Método para exibir o status do personagem
    public void exibirStatus() {
        System.out.println("Nome: " + nome);         // Exibe o nome do personagem
        System.out.println("Idade: " + idade);       // Exibe a idade do personagem
        System.out.println("Formação: " + formacao); // Exibe a formação do personagem
    }
}
