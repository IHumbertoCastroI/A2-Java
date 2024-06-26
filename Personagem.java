import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Personagem implements Saveable, Renderable {
    private String nome;
    private int idade;
    private String profissao;

    // Construtor que inicializa os atributos do personagem
    public Personagem(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Método para salvar os dados do personagem em um arquivo
    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write(nome + "\n"); 
        writer.write(idade + "\n");
        writer.write(profissao + "\n");
    }

    // Método para carregar os dados do personagem de um arquivo
    @Override
    public void carregar(BufferedReader reader) throws IOException {
        nome = reader.readLine();
        idade = Integer.parseInt(reader.readLine()); 
        profissao = reader.readLine(); 
    }

    // Método para renderizar os dados do personagem no console
    @Override
    public void renderizar() {
        System.out.println("Personagem: " + nome + ", Idade: " + idade + ", Profissão: " + profissao);
    }

    // Método para representar o personagem como uma string (para debug ou logging)
    @Override
    public String toString() {
        return "Personagem{" + "nome='" + nome + '\'' + ", idade=" + idade + ", profissao='" + profissao + '\'' + '}';
    }
}
