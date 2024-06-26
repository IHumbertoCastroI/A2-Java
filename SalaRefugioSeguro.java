public class SalaRefugioSeguro extends Sala {
    public SalaRefugioSeguro(Personagem personagem) {
        super("Refúgio Seguro", personagem);
        cantos = new String[] {
            "Cena 1: Fortificar o refúgio",
            "Cena 2: Estocar mantimentos",
            "Cena 3: Coordenar os sobreviventes"
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
                Mensageiro.exibirMensagem("Você fortifica o refúgio para proteger contra invasões.", 50);
                mochila.adicionarItem("Refúgio Fortificado");
                break;
            case 1:
                Mensageiro.exibirMensagem("Você estoca mantimentos suficientes para todos os sobreviventes.", 50);
                mochila.adicionarItem("Mantimentos Estocados");
                break;
            case 2:
                Mensageiro.exibirMensagem("Você coordena os sobreviventes para garantir a segurança de todos.", 50);
                mochila.adicionarItem("Sobreviventes Coordenados");
                break;
        }
        cantosResolvidos[indice] = true;
    }
}
