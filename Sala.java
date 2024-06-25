import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class Sala implements Renderable, Saveable {
    private String nome;
    private String[] cantos = { "\nCena 1: O Labirinto Antigo", "\nCena 2: A Biblioteca Arcana", "\nCena 3: O Jardim Enfeitiçado" };
    private boolean[] cantosResolvidos = new boolean[3];

    public Sala(String nome) {
        this.nome = nome;
    }

    public void resolverCanto(int indice, Mochila mochila) {
        if (indice < 0 || indice >= cantos.length) {
            System.out.println("\nCena inválido.");
            return;
        }
        if (cantosResolvidos[indice]) {
            System.out.println("\nVocê já resolveu esta cena.");
            return;
        }

        switch (indice) {
            case 0:
                System.out.println("\nVocê avançou pelos corredores sinuosos do labirinto, sentindo o cheiro úmido das pedras antigas e ouvindo o eco de seus próprios passos. Tochas antigas iluminam as paredes adornadas com runas esquecidas. Finalmente, ao resolver o enigma final, uma passagem secreta se abre diante de você. Dentro, repousando em um pedestal de pedra esculpido com intricados detalhes de batalhas antigas, você encontra uma espada. A lâmina reluzente parece vibrar com uma energia ancestral, pronta para ser empunhada pelo digno aventureiro que a libertou.");
                mochila.adicionarItem("Espada Ancestral");
                break;
            case 1:
                System.out.println("\nVocê está na silenciosa biblioteca arcana, onde a poeira dança nos raios de luz que atravessam os vitrais coloridos. Livros e pergaminhos se alinham em estantes que se estendem até o teto abobadado. Após responder corretamente a última pergunta do quiz de história, um compartimento oculto na mesa se abre com um leve estalo. Dentro, repousa um escudo com entalhes dourados que narram feitos heróicos de eras passadas. Sua superfície brilha à luz das velas, prometendo proteção inigualável ao seu novo dono.");
                mochila.adicionarItem("Escudo Pedrilhante");
                break;
            case 2:
                System.out.println("\nVocê está em um jardim enfeitiçado, onde flores luminescentes e árvores frondosas criam uma atmosfera mágica e serena. O som suave de uma cascata próxima acompanha seu desafio de memória. Ao completar o mini-game, um brilho surge entre as folhagens. Seguindo o brilho, você encontra uma poção de cura repousando sobre uma rocha coberta de musgo. O líquido dentro do frasco de cristal emite um brilho suave, sugerindo suas propriedades restauradoras. Você sente uma onda de alívio ao segurar a poção, sabendo que ela pode ser a chave para sua sobrevivência em aventuras futuras.");
                mochila.adicionarItem("Poção de Cura");
                break;
        }
        cantosResolvidos[indice] = true;
    }

    @Override
    public void renderizar() {
        System.out.println("\nSala: " + nome);
        for (int i = 0; i < cantos.length; i++) {
            System.out.println((cantosResolvidos[i] ? "[Resolvido] " : "") + cantos[i]);
        }
    }

    @Override
    public void salvar(BufferedWriter writer) throws IOException {
        writer.write("\nSala\n");
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