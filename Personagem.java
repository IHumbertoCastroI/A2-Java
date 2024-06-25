import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Personagem implements Renderable, Saveable {
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

    @Override
    public void renderizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Formação: " + formacao);
    }

    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write("Personagem\n");
        writer.write(nome + "\n");
        writer.write(idade + "\n");
        writer.write(formacao + "\n");
    }

    @Override
    public void carregar(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        if (line.equals("Personagem")) {
            nome = reader.readLine();
            idade = Integer.parseInt(reader.readLine());
            formacao = reader.readLine();
        }
    }
}