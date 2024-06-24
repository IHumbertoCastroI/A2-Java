public class Personagem {
    private String nome;
    private int idade;
    private String formacao;

    public Personagem(String nome, int idade, String formacao) {
        this.nome = nome;
        this.idade = idade;
        this.formacao = formacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Formação: " + formacao);
    }
}

