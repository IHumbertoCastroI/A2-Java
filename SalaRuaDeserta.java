
public class SalaRuaDeserta extends Sala {
    public SalaRuaDeserta(Personagem personagem) {
        super("Rua Deserta", personagem);
        cantos = new String[] {
            "\nAnalisar mapa online",
            "Evitar áreas de alto risco",
            "Encontrar rota segura"
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
                Mensageiro.exibirMensagem("\nVocê sai de casa, em uma manhã aparentemente tranquila e analisa mapas online para identificar áreas seguras.",50); 
                Mensageiro.exibirMensagem("\nResolva o enigma: Qual é a praça mais antiga de Curitiba?\n", 50);
                String resposta = Console.nextLine();
                if (resposta.equalsIgnoreCase("Zacarias")) {
                    Mensageiro.exibirMensagem("Correto! Você encontrou a área segura.", 50);
                    mochila.adicionarItem("Mapa da Cidade");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 1:
                Mensageiro.exibirMensagem("\nVocê evita áreas de alto risco infestadas por zumbis. Resolva o problema: Se você está a 100 metros de um grupo de zumbis e eles se movem a 2 metros por segundo, quantos segundos você tem antes de serem alcançados?\n", 50);
                resposta = Console.nextLine();
                if (resposta.equals("50")) {
                    Mensageiro.exibirMensagem("Correto! Você evitou a área de risco.", 50);
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 2:
                Mensageiro.exibirMensagem("\nVocê precisa planejar um rota segura para atravessar a cidade. Resolva o enigma: Qual é o próximo número na sequência 1, 1, 2, 3, 5, 8?\n", 50);
                resposta = Console.nextLine();
                if (resposta.equals("13")) {
                    Mensageiro.exibirMensagem("Correto! Você encontrou a rota segura.", 50);
                    mochila.adicionarItem("Rota Planejada");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
        }
        cantosResolvidos[indice] = true;
    }
}
