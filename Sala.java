import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Sala implements Renderable, Saveable {
    private String nome;
    private String[] cantos = { "Canto 1: Puzzle do Labirinto", "Canto 2: Quiz de História", "Canto 3: Mini-Game de Memória" };
    private boolean[] cantosResolvidos = new boolean[3];

    public Sala(String nome) {
        this.nome = nome;
    }

    public void resolverCanto(int indice, Mochila mochila) {
        if (indice < 0 || indice >= cantos.length) {
            System.out.println("Canto inválido.");
            return;
        }
        if (cantosResolvidos[indice]) {
            System.out.println("Você já resolveu este canto.");
            return;
        }

        switch (indice) {
            case 0:
                System.out.println("Você resolveu o Puzzle do Labirinto e encontrou uma Espada!");
                mochila.adicionarItem("Espada");
                break;
            case 1:
                System.out.println("Você respondeu corretamente o Quiz de História e ganhou um Escudo!");
                mochila.adicionarItem("Escudo");
                break;
            case 2:
                System.out.println("Você completou o Mini-Game de Memória e recebeu uma Poção de Cura!");
                mochila.adicionarItem("Poção de Cura");
                break;
        }
        cantosResolvidos[indice] = true;
    }

    @Override
    public void renderizar() {
        System.out.println("Sala: " + nome);
        for (int i = 0; i < cantos.length; i++) {
            System.out.println((cantosResolvidos[i] ? "[Resolvido] " : "") + cantos[i]);
        }
    }

    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write("Sala\n");
        writer.write(nome + "\n");
        for (boolean resolvido : cantosResolvidos) {
            writer.write(resolvido ? "1\n" : "0\n");
        }
        writer.write("\n");
    }

    @Override
    public void carregar(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        if (line.equals("Sala")) {
            nome = reader.readLine();
            for (int i = 0; i < cantosResolvidos.length; i++) {
                cantosResolvidos[i] = reader.readLine().equals("1");
            }
        }
    }
}