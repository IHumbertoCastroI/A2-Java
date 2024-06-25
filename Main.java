import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Console console = new Console();
        boolean running = true;

        while (running) {
            // Exibição do menu principal
            System.out.println("Menu Principal:");
            System.out.println("1. Iniciar Jogo");
            System.out.println("2. Carregar Jogo");
            System.out.println("3. Sair");
            int opcao = console.lerInt("Escolha uma opção: ");

            switch (opcao) {
                case 1:
                    iniciarJogo(console);
                    break;
                case 2:
                    carregarJogoMenu(console);
                    break;
                case 3:
                    running = false;
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        console.fechar(); // Fechar o console após a interação com o usuário
    }

    private static void iniciarJogo(Console console) {
        // Leitura dos dados do jogador para criar o personagem
        System.out.println("Iniciando novo jogo!");
        String nome = console.lerString("Digite o nome do seu personagem: ");
        int idade = console.lerInt("Digite a idade do seu personagem: ");
        String formacao = console.lerString("Digite a formação do seu personagem: ");

        // Criação do personagem com base nos inputs do jogador
        Personagem personagem = new Personagem(nome, idade, formacao);

        // Criação da mochila do personagem
        Mochila mochila = new Mochila();

        // Criação da sala
        Sala sala = new Sala("Sala Principal");

        // Criação da janela do jogo e adição dos componentes
        Display display = new Display();
        display.addComponent(personagem);
        display.addComponent(mochila);
        display.addComponent(sala);

        boolean jogando = true;

        while (jogando) {
            // Renderização da janela do jogo
            display.render();

            // Escolha do canto da sala
            int escolha = console.lerInt("Digite o número do canto para explorar (0-2), 3 para salvar, 4 para carregar ou -1 para sair: ");
            if (escolha == -1) {
                jogando = false;
            } else if (escolha == 3) {
                salvarJogo(personagem, mochila, sala);
            } else if (escolha == 4) {
                carregarJogo(personagem, mochila, sala);
            } else {
                sala.resolverCanto(escolha, mochila);
            }
        }
    }

    private static void carregarJogoMenu(Console console) {
        System.out.println("Carregando jogo...");
        // Criação do personagem e outros componentes
        Personagem personagem = new Personagem("", 0, ""); // Usando um construtor válido
        Mochila mochila = new Mochila();
        Sala sala = new Sala("Sala Principal");

        carregarJogo(personagem, mochila, sala);

        // Continuar o jogo a partir do estado carregado
        Display display = new Display();
        display.addComponent(personagem);
        display.addComponent(mochila);
        display.addComponent(sala);

        boolean jogando = true;

        while (jogando) {
            // Renderização da janela do jogo
            display.render();

            // Escolha do canto da sala
            int escolha = console.lerInt("Digite o número do canto para explorar (0-2), 3 para salvar, 4 para carregar ou -1 para sair: ");
            if (escolha == -1) {
                jogando = false;
            } else if (escolha == 3) {
                salvarJogo(personagem, mochila, sala);
            } else if (escolha == 4) {
                carregarJogo(personagem, mochila, sala);
            } else {
                sala.resolverCanto(escolha, mochila);
            }
        }
    }

    private static void carregarJogo(Personagem personagem, Mochila mochila, Sala sala) {
        try (BufferedReader reader = new BufferedReader(new FileReader("savegame.txt"))) {
            personagem.carregar(reader);
            mochila.carregar(reader);
            sala.carregar(reader);
            System.out.println("Jogo carregado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao carregar o jogo: " + e.getMessage());
        }
    }

    private static void salvarJogo(Personagem personagem, Mochila mochila, Sala sala) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("savegame.txt"))) {
            personagem.salvar(writer);
            mochila.salvar(writer);
            sala.salvar(writer);
            System.out.println("Jogo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o jogo: " + e.getMessage());
        }
    }
}
