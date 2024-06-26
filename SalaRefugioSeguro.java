
public class SalaRefugioSeguro extends Sala {
    public SalaRefugioSeguro(Personagem personagem) {
        super("Refúgio Seguro", personagem);
        cantos = new String[] {
            "Fortificar o refúgio",
            "Estocar mantimentos",
            "Coordenar os sobreviventes"
        };
        
    }

    @Override
    public void resolverCanto(int indice, Mochila mochila) {

        if (indice < 0 || indice >= cantos.length) {
            Mensageiro.exibirMensagem("Canto inválido.", 50);
            return;
        }
        if (cantosResolvidos[indice]) {
            Mensageiro.exibirMensagem("Você já resolveu este canto.", 50);
            return;
        }

        switch (indice) {
            case 0:
                Mensageiro.exibirMensagem("Você fortifica o refúgio para proteger contra invasões. Resolva: Qual é o resultado da expressão 7 + 5 * 2?", 50);
                String resposta = Console.nextLine();
                if (resposta.equals("17")) {
                    Mensageiro.exibirMensagem("Correto! Você fortificou o refúgio.", 50);
                    mochila.adicionarItem("Refúgio Fortificado");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 1:
                Mensageiro.exibirMensagem("Você estoca mantimentos suficientes para todos os sobreviventes. Resolva: Se cada sobrevivente consome 2 litros de água por dia e você tem 10 sobreviventes, quantos litros de água são necessários para uma semana?", 50);
                resposta = Console.nextLine();
                if (resposta.equals("140")) {
                    Mensageiro.exibirMensagem("Correto! Você estocou os mantimentos.", 50);
                    mochila.adicionarItem("Mantimentos Estocados");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 2:
                Mensageiro.exibirMensagem("Você coordena os sobreviventes para garantir a segurança de todos. Resolva: Qual é a fórmula para calcular a área de um círculo?", 50);
                resposta = Console.nextLine();
                if (resposta.equalsIgnoreCase("pi*r^2") || resposta.equalsIgnoreCase("πr²")) {
                    Mensageiro.exibirMensagem("Correto! Você coordenou os sobreviventes.", 50);
                    Mensageiro.exibirMensagem("VOCÊ DESPLOQUEOU O PROLOGO AGORA EXISTE UMA OPÇÃO SECRETA \n\n PRESSIONE 8", 50);
                    mochila.adicionarItem("Sobreviventes Coordenados");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 8:
                Mensageiro.exibirMensagem("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⣶⣾⣶⣶⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⣠⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⣸⣿⣿⡿⠋⠀⠈⠻⠿⠋⠉⢻⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⣿⣿⣿⡄⠀⢀⣤⣀⣀⠀⠀⠀⠀⣀⣴⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⢸⣿⣿⣷⡠⠋⣙⣿⣏⡃⠀⢀⣾⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⣿⠛⣿⡇⠀⠛⠛⠛⠃⠀⠘⣿⡷⠚⠋⢹⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠘⣷⣄⢱⠀⠀⠀⠉⣒⠀⠀⣿⣷⣆⡀⢸⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⠘⣆⣨⡇⠀⢀⠞⠁⠀⠀⣼⣿⣷⣿⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⠀⠈⡶⢤⣤⠴⢧⣾⣿⡟⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡆⠀⠀⠀⠀⠈⠁⠰⣿⣻⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⠻⡿⠘⠦⣀⠀⠀⠀⠀⣰⣿⣷⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⣠⠞⠸⡄⠙⠦⣀⡈⠑⠂⠁⢺⣿⣯⣼⣿⣏⠻⣟⠒⠦⢤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠴⢂⣀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⢀⣠⠴⠛⡁⠀⠀⠙⡄⠀⠀⠈⠑⠒⠶⣿⣻⣿⣿⣿⣿⡇⢀⣹⠆⠀⢄⠉⠳⣄⠀⠀⠀⠀⣀⡼⢋⣠⠞⠋⠁⠀⠀⠀\r\n" + //
                                        "⠀⢀⡴⠋⠈⢦⠀⠳⡀⠀⠀⠈⢦⣀⣴⣾⣿⣿⣿⡿⠿⠿⢿⣿⡿⠙⣇⠀⠀⢸⡀⠀⢹⢧⠀⣠⡾⢋⡴⠋⠀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⡴⠋⠀⠀⠀⠈⠃⠀⠱⡀⠀⠀⠀⠙⢿⣿⣿⣿⣿⠁⠀⠀⡄⠁⠀⠀⠈⢧⡀⢸⡇⠀⢸⣼⣧⠏⣰⠋⠀⢀⡀⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠱⡄⠀⠀⠀⠈⠻⣿⣶⠇⠀⢀⣀⠸⠀⠀⠀⠀⡼⢧⠀⢻⡄⢸⣿⢃⡼⠁⠀⢠⠋⢁⠀⠀⠀⠀⠀⠀\r\n" + //
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢦⡀⠀⠀⠀⡘⢦⠀⠀⠘⠯⠀⠀⡇⠀⢰⠃⠘⡄⠀⡇⢸⡏⡼⠀⠀⠀⠈⠃⠠⠀⠀⠀⠀⠀⣀", 2);
                Mensageiro.exibirMensagem("Ola, preciso te dizer algo, A sua Sinuzite te salvou do virus zombie, logo percebi pelo nariz...", 50);
                Mensageiro.exibirMensagem("\n Me chamo Dr.Bacteria II", 50);
                Mensageiro.exibirMensagem("\nPreciso da sua zinuzite para terminar de desenvolver a cura para aqueles que são zumbie. Resolva o seguinte: Combine os ingredientes na proporção correta para criar a cura.\n" +
                        "Ingredientes disponíveis: \n" +
                        "1. Extrato de Erva Z (50ml)\n" +
                        "2. Solução Salina (100ml)\n" +
                        "3. Anticorpos da Sinuzite (200ml)\n" +
                        "Qual é a proporção correta dos ingredientes para criar a cura (formato: 1:2:4)?", 50);
                resposta = Console.nextLine();
                if (resposta.equals("1:2:4")) {
                    Mensageiro.exibirMensagem("Correto! Você ajudou a desenvolver a cura.", 50);
                    mochila.adicionarItem("Cura Desenvolvida");
                    Mensageiro.exibirMensagem("...", 1000);
                    LimpaTerminal.limpaTela();                    
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
        }
        cantosResolvidos[indice] = true;
    }
}
