public class SalaEstacaoMetro extends Sala {
    public SalaEstacaoMetro(Personagem personagem) {
        super("Estação de Metrô", personagem);
        cantos = new String[] {
            "Cena 1: Restaurar energia",
            "Cena 2: Operar sistemas de portas",
            "Cena 3: Explorar túneis"
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
                Mensageiro.exibirMensagem("Você restaura a energia na sala de controle.", 50);
                mochila.adicionarItem("Energia Restaurada");
                break;
            case 1:
                Mensageiro.exibirMensagem("Você opera os sistemas de portas e luzes.", 50);
                mochila.adicionarItem("Sistemas Operacionais");
                break;
            case 2:
                Mensageiro.exibirMensagem("Você explora os túneis e encontra suprimentos valiosos.", 50);
                mochila.adicionarItem("Suprimentos do Metrô");
                break;
        }
        cantosResolvidos[indice] = true;
    }
}

