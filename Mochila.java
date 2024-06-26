import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mochila implements Saveable, Renderable {
    private List<String> itens;

    public Mochila() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write(itens.size() + "\n");
        for (String item : itens) {
            writer.write(item + "\n");
        }
    }

    @Override
    public void carregar(BufferedReader reader) throws IOException {
        int tamanho = Integer.parseInt(reader.readLine());
        itens = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            itens.add(reader.readLine());
        }
    }

    @Override
    public void renderizar() {
        System.out.println("Mochila:");
        if (itens.isEmpty()) {
            System.out.println("  (vazia)");
        } else {
            for (String item : itens) {
                System.out.println("  - " + item);
            }
        }
    }

    @Override
    public String toString() {
        return "Mochila{" + "itens=" + itens + '}';
    }
}
