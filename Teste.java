import java.util.Scanner;

public class Teste {
    
    public void metodoQualquer() {
        Scanner scanner = new Scanner(System.in);  // Inicializa o Scanner para ler da entrada padrão
        int num1;
        Personagem personagem = new Personagem("Jason", 30, "Professor de JAVA");

        System.out.print("Procure em: \n\n 1 - para Balde \n 2 - para Baú \n 3 - para Cesto: \n\n");
        
        do {
            num1 = scanner.nextInt();  // Ler um número inteiro

            switch (num1) {
                case 1:
                    Mensageiro.exibirMensagem("Jason não encontra nada no Balde.\n", 90);
                    break;
                case 2:
                    Mensageiro.exibirMensagem("Jason não encontra nada no Baú.\n", 90);
                    break;
                case 3:
                    Mensageiro.exibirMensagem("...", 500);
                    Mensageiro.exibirMensagem("Miau Miaaauu", 100);
                    Mensageiro.exibirMensagem("...", 500);
                    System.out.println("\n");
                    Mensageiro.exibirMensagem("░░░░░░░░░░░░░░░░░░░░░▄▀░░▌\r\n" +
                                              "░░░░░░░░░░░░░░░░░░░▄▀▐░░░▌\r\n" +
                                              "░░░░░░░░░░░░░░░░▄▀▀▒▐▒░░░▌\r\n" +
                                              "░░░░░▄▀▀▄░░░▄▄▀▀▒▒▒▒▌▒▒░░▌\r\n" +
                                              "░░░░▐▒░░░▀▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n" +
                                              "░░░░▌▒░░░░▒▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄\r\n" +
                                              "░░░░▐▒░░░░░▒▒▒▒▒▒▒▒▒▌▒▐▒▒▒▒▒▀▄\r\n" +
                                              "░░░░▌▀▄░░▒▒▒▒▒▒▒▒▐▒▒▒▌▒▌▒▄▄▒▒▐\r\n" +
                                              "░░░▌▌▒▒▀▒▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒█▄█▌▒▒▌\r\n" +
                                              "░▄▀▒▐▒▒▒▒▒▒▒▒▒▒▒▄▀█▌▒▒▒▒▒▀▀▒▒▐░░░▄\r\n" +
                                              "▀▒▒▒▒▌▒▒▒▒▒▒▒▄▒▐███▌▄▒▒▒▒▒▒▒▄▀▀▀▀\r\n" +
                                              "▒▒▒▒▒▐▒▒▒▒▒▄▀▒▒▒▀▀▀▒▒▒▒▄█▀░░▒▌▀▀▄▄\r\n" +
                                              "▒▒▒▒▒▒█▒▄▄▀▒▒▒▒▒▒▒▒▒▒▒░░▐▒▀▄▀▄░░░░▀\r\n" +
                                              "▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▄▒▒▒▒▄▀▒▒▒▌░░▀▄\r\n" +
                                              "▒▒▒▒▒▒▒▒▀▄▒▒▒▒▒▒▒▒▀▀▀▀▒▒▒▄▀", 2);
                    break;
                default:
                    Mensageiro.exibirMensagem("Opção inválida. Tente novamente.\n", 5);
                    break;
            }
        } while (num1 != 3);

        Mensageiro.exibirMensagem("\nVocê escolheu o Cesto. Encontrou um Gato.", 90);
        System.out.println("\n");
        Mensageiro.exibirMensagem("Gato:  Ola eu, me chamo  Getters n' Setters", 100);
        Mensageiro.exibirMensagem("\nGato: Sou muito poderoso ", 100);
        Mensageiro.exibirMensagem("\nGato: Na verdade, Você já me conhece como... ", 100);
        Mensageiro.exibirMensagem("\nCausador da sua... ", 100);
        Mensageiro.exibirMensagem("\n ", 900);
        Mensageiro.exibirMensagem("SINUZITE ", 240);
        Mensageiro.exibirMensagem("\nGato: AIUHAIUHAIUHAIUHA MIAUUUU ", 100);
        Mensageiro.exibirMensagem("\n ", 200);
        Mensageiro.exibirMensagem("\nFIM ", 200);
        Mensageiro.exibirMensagem("\n", 200);

        scanner.close();  // Fechar o Scanner quando não for mais necessário

        // Exibir status do personagem após as interações
        personagem.exibirStatus();
    }
}
