import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mochila implements Saveable, Renderable {
    private List<String> itens; 

    // Construtor que inicializa a lista de itens
    public Mochila() {
        itens = new ArrayList<>();
    }

    // Método para adicionar um item à mochila
    public void adicionarItem(String item) {
        itens.add(item);
    }

    // Método para salvar os itens da mochila em um arquivo
    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write(itens.size() + "\n"); // Escreve o número de itens
        for (String item : itens) {
            writer.write(item + "\n"); // Escreve cada item
        }
    }

    // Método para carregar os itens da mochila de um arquivo
    @Override
    public void carregar(BufferedReader reader) throws IOException {
        int tamanho = Integer.parseInt(reader.readLine()); 
        itens = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            itens.add(reader.readLine()); 
        }
    }

    // Método para renderizar a mochila no console
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

    // Método para representar a mochila como uma string (para debug ou logging)
    @Override
    public String toString() {
        return "Mochila{" + "itens=" + itens + '}';
    }
}
