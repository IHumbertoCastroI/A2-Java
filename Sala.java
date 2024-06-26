import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public abstract class Sala implements Saveable, Renderable {
    protected String nome; 
    protected Personagem personagem; 
    protected String[] cantos; 
    protected boolean[] cantosResolvidos; 

    // Construtor da classe Sala
    public Sala(String nome, Personagem personagem) {
        this.nome = nome;
        this.personagem = personagem;
        this.cantosResolvidos = new boolean[3]; 
        Arrays.fill(this.cantosResolvidos, false); 
    }

    // Método abstrato para resolver um canto específico da sala
    public abstract void resolverCanto(int indice, Mochila mochila);

    // Método para salvar o estado da sala em um arquivo
    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write(nome + "\n");
        for (boolean resolvido : cantosResolvidos) {
            writer.write(resolvido + "\n"); 
        }
    }

    // Método para carregar o estado da sala de um arquivo
    @Override
    public void carregar(BufferedReader reader) throws IOException {
        nome = reader.readLine(); 
        for (int i = 0; i < cantosResolvidos.length; i++) {
            cantosResolvidos[i] = Boolean.parseBoolean(reader.readLine()); 
        }
    }

    // Método para renderizar as informações da sala no console
    @Override
    public void renderizar() {
        System.out.println("\nSala: " + nome); 
        for (int i = 0; i < cantos.length; i++) {
            String resolvido = cantosResolvidos[i] ? "(resolvido)" : "(não resolvido)";
            System.out.println("  Cena " + i + ": " + cantos[i] + " " + resolvido); 
        }
    }

    // Método toString para representação textual da sala (para debug ou logging)
    @Override
    public String toString() {
        return "Sala{" + "nome='" + nome + '\'' + ", cantosResolvidos=" + Arrays.toString(cantosResolvidos) + '}';
    }
}
