public class Main {

    public static void main(String[] args) {
        Console console = new Console();

        // Leitura dos dados do jogador para criar o personagem
        System.out.println("Bem-vindo ao jogo!");
        String nome = console.lerString("Digite o nome do seu personagem: ");
        int idade = console.lerInt("Digite a idade do seu personagem: ");
        String formacao = console.lerString("Digite a formação do seu personagem: ");

        // Criação do personagem com base nos inputs do jogador
        Personagem personagem = new Personagem(nome, idade, formacao);

        // Criação da mochila do personagem
        Mochila mochila = new Mochila();

        // Criação da sala
        SalaTeste sala = new SalaTeste("Sala Principal");

        // Criação da janela do jogo e adição dos componentes
        Display display = new Display();
        display.addComponent(mochila);
        display.addComponent(sala);

        while (true) {
            // Renderização da janela do jogo
            display.render();

            // Escolha do canto da sala
            int escolha = console.lerInt("Digite o número do canto para explorar (1-3) ou 0 para sair: ");
            if (escolha == 0) {
                break;
            }
            sala.resolverCanto(escolha, mochila);
        }

        console.fechar(); // Fechar o console após a interação com o usuário
    }
}
