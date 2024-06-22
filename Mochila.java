import java.util.ArrayList;
import java.util.List;

public class Mochila {
    private List<String> itens;

    public Mochila() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public void removerItem(String item) {
        itens.remove(item);
    }

    public void render() {
        System.out.println("Mochila:");
        for (String item : itens) {
            System.out.println("- " + item);
        }
    }
}
