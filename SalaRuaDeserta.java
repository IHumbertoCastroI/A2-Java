public class SalaRuaDeserta extends Sala {
    public SalaRuaDeserta(Personagem personagem) {
        super("Rua Deserta", personagem);
        cantos = new String[] {
            "Cena 1: Analisar mapa online",
            "Cena 2: Evitar áreas de alto risco",
            "Cena 3: Encontrar rota segura"
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
                Mensageiro.exibirMensagem("Você analisa mapas online para identificar áreas seguras.", 50);
                mochila.adicionarItem("Mapa da Cidade");
                break;
            case 1:
                Mensageiro.exibirMensagem("Você evita áreas de alto risco infestadas por zumbis.", 50);
                mochila.adicionarItem("Rota Segura");
                break;
            case 2:
                Mensageiro.exibirMensagem("Você encontra uma rota segura para atravessar a cidade.", 50);
                mochila.adicionarItem("Rota Planejada");
                break;
        }
        cantosResolvidos[indice] = true;
    }
}
