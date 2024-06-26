import java.util.Scanner;

public class SalaHospitalAbandonado extends Sala {
    public SalaHospitalAbandonado(Personagem personagem) {
        super("Hospital Abandonado", personagem);
        cantos = new String[] {
            "Acessar registros médicos",
            "Descobrir localização de suprimentos",
            "Ajudar os sobreviventes"
        };
    }

    @Override
    public void resolverCanto(int indice, Mochila mochila) {
        Scanner scanner = new Scanner(System.in);

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
                Mensageiro.exibirMensagem("Você acessa os registros médicos eletrônicos do hospital. Resolva: Se um paciente toma 3 comprimidos a cada 4 horas, quantos comprimidos ele toma em 24 horas?", 50);
                String resposta = scanner.nextLine();
                if (resposta.equals("18")) {
                    Mensageiro.exibirMensagem("Correto! Você acessou os registros médicos.", 50);
                    mochila.adicionarItem("Registros Médicos");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 1:
                Mensageiro.exibirMensagem("Você descobre a localização exata de suprimentos médicos cruciais. Resolva: Qual é a fórmula química da água?", 50);
                resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("H2O")) {
                    Mensageiro.exibirMensagem("Correto! Você encontrou os suprimentos médicos.", 50);
                    mochila.adicionarItem("Localização de Suprimentos");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 2:
                Mensageiro.exibirMensagem("Você ajuda os sobreviventes a encontrarem um caminho seguro para fugir da cidade. Resolva: Se você está a 300 metros do ponto de encontro e se move a 5 metros por segundo, quanto tempo leva para chegar lá?", 50);
                resposta = scanner.nextLine();
                if (resposta.equals("60")) {
                    Mensageiro.exibirMensagem("Correto! Você encontrou um caminho seguro.", 50);
                    mochila.adicionarItem("Caminho Seguro");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
        }  
        cantosResolvidos[indice] = true;
    }
}