public class SalaCasaDoProgramador extends Sala {
    public SalaCasaDoProgramador(Personagem personagem) {
        super("Casa do Programador", personagem);
        cantos = new String[] {
            "Cena 1: Verificar a despensa",
            "Cena 2: Inspecionar o computador",
            "Cena 3: Preparar o sistema de segurança"
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
                Mensageiro.exibirMensagem("Você verifica a despensa e encontra alguns alimentos e água potável.", 50);
                mochila.adicionarItem("Alimentos e Água");
                break;
            case 1:
                Mensageiro.exibirMensagem("Você inspeciona o computador e descobre anotações sobre a pandemia.", 50);
                mochila.adicionarItem("Anotações do Computador");
                break;
            case 2:
                Mensageiro.exibirMensagem("Você improvisa um sistema de segurança usando dispositivos eletrônicos e sensores.", 50);
                mochila.adicionarItem("Sistema de Segurança");
                break;
        }
        cantosResolvidos[indice] = true;
    }
}
