

public class SalaEstacaoMetro extends Sala {
    public SalaEstacaoMetro(Personagem personagem) {
        super("Estação de Metrô", personagem);
        cantos = new String[] {
            "\nRestaurar energia",
            "Operar sistemas de portas",
            "Explorar túneis"
        };
    }

    @Override
    public void resolverCanto(int indice, Mochila mochila) {
        if (indice < 0 || indice >= cantos.length) {
            Mensageiro.exibirMensagem("\nCanto inválido.", 50);
            return;
        }
        if (cantosResolvidos[indice]) {
            Mensageiro.exibirMensagem("\nVocê já resolveu este canto.", 50);
            return;
        }

        switch (indice) {
            case 0:
                Mensageiro.exibirMensagem("\nVocê restaura a energia na sala de controle. Resolva: Qual é a raiz quadrada de 144?\n", 50);
                String resposta = Console.nextLine();
                if (resposta.equals("12")) {
                    Mensageiro.exibirMensagem("Correto! Você restaurou a energia.", 50);
                    mochila.adicionarItem("Energia Restaurada");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 1:
                Mensageiro.exibirMensagem("\nVocê opera os sistemas de portas e luzes. Resolva: Qual é a soma dos ângulos internos de um triângulo?\n", 50);
                resposta = Console.nextLine();
                if (resposta.equals("180")) {
                    Mensageiro.exibirMensagem("Correto! Você operou os sistemas.", 50);
                    mochila.adicionarItem("Sistemas Operacionais");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 2:
                Mensageiro.exibirMensagem("\nVocê explora os túneis e encontra suprimentos valiosos. Resolva: Se você tem 5 pacotes de suprimentos e cada pacote pesa 4 kg, qual é o peso total?\n", 50);
                resposta = Console.nextLine();
                if (resposta.equals("20")) {
                    Mensageiro.exibirMensagem("Correto! Você encontrou os suprimentos.", 50);
                    mochila.adicionarItem("Suprimentos do Metrô");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
        }
        cantosResolvidos[indice] = true;
    }
}

