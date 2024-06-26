import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        
        boolean running = true; // Variável para controlar o loop principal

        while (running) {
            Mensageiro.exibirMensagem("\r\n" + //
                                "                                                                                                                                 \r" + //
                                "   SSSSSSSSSSSSSSS   iiii                                                        iiii          tttt           \r" + //
                                " SS░░░░░░░░░░░░░░░S i░░░░i                                                      i░░░░i      ttt░░░t           \r" + //
                                "S░░░░░SSSSSS░░░░░░S  iiii                                                        iiii       t░░░░░t           \r" + //
                                "S░░░░░S     SSSSSSS                                                                         t░░░░░t         1  \r" + //
                                "S░░░░░S            iiiiiiinnnn  nnnnnnnn    uuuuuu    uuuuuu  zzzzzzzzzzzzzzzzziiiiiiittttttt░░░░░ttttttt     \r" + //
                                "S░░░░░S            i░░░░░in░░░nn░░░░░░░░nn  u░░░░u    u░░░░u  z░░░░░░░░░░░░░░░░zi░░░░░it░░░░░░░░░░░░░░░░░t     \r" + //
                                " S░░░░SSSS          i░░░░in░░░░░░░░░░░░░░nn u░░░░u    u░░░░u  z░░░░░░░░░░░░░░░z  i░░░░it░░░░░░░░░░░░░░░░░t     \r" + //
                                "  SS░░░░░░SSSSS     i░░░░inn░░░░░░░░░░░░░░░nu░░░░u    u░░░░u  zzzzzzzz░░░░░░░z   i░░░░itttttt░░░░░░░tttttt     \r" + //
                                "    SSS░░░░░░░░SS   i░░░░i  n░░░░░nnnn░░░░░nu░░░░u    u░░░░u        z░░░░░░z    i░░░░i      t░░░░░t           \r" + //
                                "       SSSSSS░░░░S  i░░░░i  n░░░░n    n░░░░nu░░░░u    u░░░░u       z░░░░░░z     i░░░░i      t░░░░░t           \r" + //
                                "            S░░░░░S i░░░░i  n░░░░n    n░░░░nu░░░░u    u░░░░u      z░░░░░░z      i░░░░i      t░░░░░t           \r" + //
                                "            S░░░░░S i░░░░i  n░░░░n    n░░░░nu░░░░░uuuu░░░░░u     z░░░░░░z       i░░░░i      t░░░░░t    tttttte\r" + //
                                "SSSSSSS     S░░░░░Si░░░░░░i n░░░░n    n░░░░nu░░░░░░░░░░░░░░░uu  z░░░░░░zzzzzzzzi░░░░░░i     t░░░░░tttt░░░░░░te\r" + //
                                "S░░░░░░SSSSSS░░░░░Si░░░░░░i n░░░░n    n░░░░n u░░░░░░░░░░░░░░░u z░░░░░░░░░░░░░░zi░░░░░░i     tt░░░░░░░░░░░░░░t \r" + //
                                "S░░░░░░░░░░░░░░░SS i░░░░░░i n░░░░n    n░░░░n  uu░░░░░░░░uu░░░uz░░░░░░░░░░░░░░░zi░░░░░░i       tt░░░░░░░░░░░tt \r" + //
                                " SSSSSSSSSSSSSSS   iiiiiiii nnnnnn    nnnnnn    uuuuuuuu  uuuuzzzzzzzzzzzzzzzzziiiiiiii         ttttttttttt   \r" + //
                                "                                                                                                                                 \r" + //
                                "                                                                                                                                 \r" + //
                                "",1 );
            Mensageiro.exibirMensagem("Menu Principal:\n", 50);
            Mensageiro.exibirMensagem("\n1. Iniciar Jogo", 50);
            Mensageiro.exibirMensagem("\n2. Carregar Jogo", 50);
            Mensageiro.exibirMensagem("\n3. Sair", 50);
            int opcao = Console.lerInt("\n\nEscolha uma opção: ");

            switch (opcao) {
                case 1:
                    iniciarJogo();
                    break;
                case 2:
                    carregarJogoMenu();
                    break;
                case 3:
                    running = false;
                    Mensageiro.exibirMensagem("\n Saindo do jogo", 50);
                    Mensageiro.exibirMensagem("\n ...", 50);
                    break;
                default:
                    Mensageiro.exibirMensagem("\n Opção inválida. Tente novamente.", 50);
            }
        }
        Console.fechar();
    }

    private static void iniciarJogo() {
        Mensageiro.exibirMensagem("\nIniciando novo jogo!\n", 80);
        String nome = Console.lerString("\nDigite o nome do seu personagem: ");
        int idade = Console.lerInt("\nDigite a idade do seu personagem: ");
        String formacao = Console.lerString("\nDigite a formação do seu personagem: \n");

        Personagem personagem = new Personagem(nome, idade, formacao);
        Mochila mochila = new Mochila();

        Sala sala1 = new SalaCasaDoProgramador(personagem);
        Sala sala2 = new SalaRuaDeserta(personagem);
        Sala sala3 = new SalaEstacaoMetro(personagem);
        Sala sala4 = new SalaHospitalAbandonado(personagem);
        Sala sala5 = new SalaRefugioSeguro(personagem);

        Display display = new Display();
        display.addComponent(personagem);
        display.addComponent(mochila);
        display.addComponent(sala1);

        boolean jogando = true;
        int salaAtual = 0;
        Sala[] salas = {sala1, sala2, sala3, sala4, sala5};

        while (jogando) {
            display.render();

            int escolha = Console.lerInt("\n Digite o número do canto para explorar (0-2) \n / 3 para salvar / 4 para carregar / 5 para próxima sala \n -1 para sair\n");
            if (escolha == -1) {
                jogando = false;
            } else if (escolha == 3) {
                salvarJogo(personagem, mochila, salas[salaAtual]);
            } else if (escolha == 4) {
                carregarJogo(personagem, mochila, salas[salaAtual]);
            } else if (escolha == 5) {
                if (salaAtual < salas.length - 1) {
                    salaAtual++;
                    display.addComponent(salas[salaAtual]);
                } else {
                    Mensageiro.exibirMensagem("Você já está na última sala.", 50);
                }
            } else {
                salas[salaAtual].resolverCanto(escolha, mochila);
            }
        }
    }

    private static void carregarJogoMenu() {
        Mensageiro.exibirMensagem("\nCarregando jogo...", 0);
        Personagem personagem = new Personagem("", 0, "");
        Mochila mochila = new Mochila();
        Sala sala = null; // Inicializa a sala como null para carregar do arquivo
    
        try (BufferedReader reader = new BufferedReader(new FileReader("savegame.txt"))) {
            // Carrega o personagem, a mochila e a sala
            personagem.carregar(reader);
            mochila.carregar(reader);
    
            // Identifica o nome da sala no arquivo
            String nomeSala = reader.readLine();
            
            // Determina qual tipo de sala carregar com base no nome
            switch (nomeSala) {
                case "Casa do Programador":
                    sala = new SalaCasaDoProgramador(personagem);
                    break;
                case "Estação de Metrô":
                    sala = new SalaEstacaoMetro(personagem);
                    break;
                case "Hospital Abandonado":
                    sala = new SalaHospitalAbandonado(personagem);
                    break;
                case "Refúgio Seguro":
                    sala = new SalaRefugioSeguro(personagem);
                    break;
                case "Rua Deserta":
                    sala = new SalaRuaDeserta(personagem);
                    break;
                default:
                    Mensageiro.exibirMensagem("Sala salva desconhecida: " + nomeSala, 50);
                    return; // Se não reconhecer a sala, encerra o carregamento
            }
            
            sala.carregar(reader); // Carrega o estado específico da sala
    
            Mensageiro.exibirMensagem("Jogo carregado com sucesso!", 50);
        } catch (IOException e) {
            Mensageiro.exibirMensagem("Erro ao carregar o jogo: " + e.getMessage(), 50);
            return; // Em caso de erro, retorna sem inicializar o jogo
        }
    
        Display display = new Display();
        display.addComponent(personagem);
        display.addComponent(mochila);
        display.addComponent(sala);
    
        boolean jogando = true;
    
        while (jogando) {
            display.render();
    
            int escolha = Console.lerInt("\n Digite o número do canto para explorar (0-2) \n / 3 para salvar / 4 para carregar / 5 para próxima sala \n -1 para sair\n");
            if (escolha == -1) {
                jogando = false;
            } else if (escolha == 3) {
                salvarJogo(personagem, mochila, sala);
            } else if (escolha == 4) {
                carregarJogoMenu(); // Reinicia o processo de carregamento
                return; // Retorna para evitar a execução do restante do loop
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
            Mensageiro.exibirMensagem("Jogo carregado com sucesso!", 50);
        } catch (IOException e) { 
            Mensageiro.exibirMensagem("Erro ao carregar o jogo: " + e.getMessage(), 50);
        }
    }

    private static void salvarJogo(Personagem personagem, Mochila mochila, Sala sala) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("savegame.txt"))) {
            personagem.salvar(writer);
            mochila.salvar(writer);
            sala.salvar(writer);
            Mensageiro.exibirMensagem("Jogo salvo com sucesso!", 50);
        } catch (IOException e) {
            Mensageiro.exibirMensagem("Erro ao salvar o jogo: " + e.getMessage(), 50);
        }
    }
}
