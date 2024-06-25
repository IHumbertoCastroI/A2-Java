import java.util.ArrayList;
import java.util.List;

public class Display {
    private List<Renderable> components;

    public Display() {
        components = new ArrayList<>();
    }

    public void addComponent(Renderable component) {
        components.add(component);
    }

    public void render() {
        LimpaTerminal.limpaTela();
        for (Renderable component : components) {
            component.renderizar();
        }
    }
}
