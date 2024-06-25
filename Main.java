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

        // Exibir status do personagem após o teste
        personagem.exibirStatus();

        console.fechar(); // Fechar o console após a interação com o usuário
    }
}
