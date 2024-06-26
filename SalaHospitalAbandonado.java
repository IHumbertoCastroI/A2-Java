public class SalaHospitalAbandonado extends Sala {
    public SalaHospitalAbandonado(Personagem personagem) {
        super("Hospital Abandonado", personagem);
        cantos = new String[] {
            "Cena 1: Acessar registros médicos",
            "Cena 2: Descobrir localização de suprimentos",
            "Cena 3: Ajudar os sobreviventes"
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
                Mensageiro.exibirMensagem("Você acessa os registros médicos eletrônicos do hospital.", 50);
                mochila.adicionarItem("Registros Médicos");
                break;
            case 1:
                Mensageiro.exibirMensagem("Você descobre a localização exata de suprimentos médicos cruciais.", 50);
                mochila.adicionarItem("Localização de Suprimentos");
                break;
            case 2:
                Mensageiro.exibirMensagem("Você ajuda os sobreviventes a encontrarem um caminho seguro para fugir da cidade.", 50);
                mochila.adicionarItem("Caminho Seguro");
                break;
        }
        cantosResolvidos[indice] = true;
    }
}
