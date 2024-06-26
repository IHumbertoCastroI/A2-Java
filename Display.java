import java.util.ArrayList;
import java.util.List;

public class Display {
    private List<Renderable> components; // Declara uma lista para armazenar componentes renderizáveis

    public Display() {
        components = new ArrayList<>(); // Inicializa a lista de componentes como um ArrayList
    }

    public void addComponent(Renderable component) {
        components.add(component); // Adiciona um componente à lista de componentes
    }

    public void render() {
        LimpaTerminal.limpaTela(); // Limpa o terminal antes de renderizar
        for (Renderable component : components) {
            component.renderizar(); // Chama o método renderizar() de cada componente
        }
    }
}
