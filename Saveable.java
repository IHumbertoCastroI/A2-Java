import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public interface Saveable {
    void salvar(BufferedWriter writer) throws IOException;
    void carregar(BufferedReader reader) throws IOException;
}