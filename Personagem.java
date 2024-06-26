import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Personagem implements Saveable, Renderable {
    private String nome;
    private int Idade;
    private String Profissão;

    public Personagem(String nome, int Idade, String classe) {
        this.nome = nome;
        this.Idade = Idade;
        this.Profissão = classe;
    }

    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write(nome + "\n");
        writer.write(Idade + "\n");
        writer.write(Profissão + "\n");
    }

    @Override
    public void carregar(BufferedReader reader) throws IOException {
        nome = reader.readLine();
        Idade = Integer.parseInt(reader.readLine());
        Profissão = reader.readLine();
    }

    @Override
    public void renderizar() {
        System.out.println("Personagem: " + nome + ", Idade: " + Idade + ", Profissão: " + Profissão);
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome='" + nome + '\'' + ", idade=" + Idade + ", profissão='" + Profissão + '\'' + '}';
    }
}
