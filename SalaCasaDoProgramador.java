import java.util.Scanner;

public class SalaCasaDoProgramador extends Sala {
    public SalaCasaDoProgramador(Personagem personagem) {
        super("Sua casa", personagem);
        cantos = new String[] {
            "Inspecionar o computador",
            "Verificar a despensa",
            "Preparar o sistema de segurança"
        };
    }

    @Override
    public void resolverCanto(int indice, Mochila mochila) {
        Scanner scanner = new Scanner(System.in);

        if (indice < 0 || indice >= cantos.length) {
            Mensageiro.exibirMensagem("\nCanto inválido.", 50);
            return;
        }
        if (cantosResolvidos[indice]) {
            Mensageiro.exibirMensagem("\nVocê já resolveu este canto.", 50);
            return;
        }

        switch (indice) {
            case 1:
                Mensageiro.exibirMensagem("Você verifica a despensa e encontra alguns alimentos e água potável.", 50);
                mochila.adicionarItem("Alimentos e Água");
                break;
            case 0:
                Mensageiro.exibirMensagem("                       .,,uod8B8bou,,.\r\n" + //
                                        "              ..,uod8BBBBBBBBBBBBBBBBRPFT?l!i:.\r\n" + //
                                        "         ,=m8BBBBBBBBBBBBBBBRPFT?!||||||||||||||\r\n" + //
                                        "         !...:!TVBBBRPFT||||||||||!!^^\"\"'   ||||\r\n" + //
                                        "         !.......:!?|||||!!^^\"\"'            ||||\r\n" + //
                                        "         !.........||||                     ||||\r\n" + //
                                        "         !.........||||  Java               ||||\r\n" + //
                                        "         !.........||||                     ||||\r\n" + //
                                        "         !.........||||                     ||||\r\n" + //
                                        "         !.........||||                     ||||\r\n" + //
                                        "         !.........||||                     ||||\r\n" + //
                                        "         `.........||||                    ,||||\r\n" + //
                                        "          .;.......||||               _.-!!|||||\r\n" + //
                                        "   .,uodWBBBBb.....||||       _.-!!|||||||||!:'\r\n" + //
                                        "!YBBBBBBBBBBBBBBb..!|||:..-!!|||||||!iof68BBBBBb....\r\n" + //
                                        "!..YBBBBBBBBBBBBBBb!!||||||||!iof68BBBBBBRPFT?!::   `.\r\n" + //
                                        "!....YBBBBBBBBBBBBBBbaaitf68BBBBBBRPFT?!:::::::::     `.\r\n" + //
                                        "!......YBBBBBBBBBBBBBBBBBBBRPFT?!::::::;:!^\"`;:::       `.\r\n" + //
                                        "!........YBBBBBBBBBBRPFT?!::::::::::^''...::::::;         iBBbo.\r\n" + //
                                        "`..........YBRPFT?!::::::::::::::::::::::::;iof68bo.      WBBBBbo.\r\n" + //
                                        "  `..........:::::::::::::::::::::::;iof688888888888b.     `YBBBP^'\r\n" + //
                                        "    `........::::::::::::::::;iof688888888888888888888b.     `\r\n" + //
                                        "      `......:::::::::;iof688888888888888888888888888888b.\r\n" + //
                                        "        `....:::;iof688888888888888888888888888888888899fT!\r\n" + //
                                        "          `..::!8888888888888888888888888888888899fT|!^\"'\r\n" + //
                                        "            `' !!988888888888888888888888899fT|!^\"'\r\n" + //
                                        "                `!!8888888888888888899fT|!^\"'\r\n" + //
                                        "                  `!988888888899fT|!^\"'\r\n" + //
                                        "                    `!9899fT|!^\"'\r\n" + //
                                        "                      `!^\"'", 2);
                Mensageiro.exibirMensagem("\n\nVocê acorda de madrugada, e na tela de seu computador tem email e que você acabou não lendo, você inspeciona o computador e descobre que no email existem uma senha infalivel contra IA.",50); 
                Mensageiro.exibirMensagem ("Para desbloquear os documentos, resolva a senha simples a prova de IA: Qual é o próximo número na sequência 2, 4, 8, 16?\n", 50);
                String resposta = scanner.nextLine();
                if (resposta.equals("32")) {
                    Mensageiro.exibirMensagem("Correto! Você desbloqueou a mensagem, e imprimiu.", 50);
                    Mensageiro.exibirMensagem("\n\nComunicado Oficial do Governo: Preparação para o Apocalipse Zumbi\n",50);
                    Mensageiro.exibirMensagem("\n Cidadãos e cidadãs dos Estados Unidos da América, preparem-se para o que pode ser o desafio mais... inesperado de suas vidas! Como diria o grande governador Arnold Schwarzenegger, I'll be back... mas dessa vez, com zumbis à espreita!\n",50);
                    Mensageiro.exibirMensagem("\n Lembrem-se das palavras sábias de Bill Murray em Groundhog Day: Não se esqueça da sua cobertura! Isso significa suprimentos de emergência, armas improvisadas (nada de bazuca, por favor) e, claro, um plano de evacuação caso a situação piore.\n",50);
                    Mensageiro.exibirMensagem("\n Para aqueles que duvidam da seriedade da situação, permitam-me relembrar as palavras de Bruce Willis em Die Hard: Yippee-ki-yay, filhos da mãe! Não podemos subestimar a ameaça iminente, mas podemos nos preparar com o mesmo fervor que Indiana Jones teve ao buscar o Santo Graal!\n",50);
                    Mensageiro.exibirMensagem("\n Portanto, fiquem alertas, mantenham suas mentes afiadas como um sabre de luz, e sigam as diretrizes de segurança. Juntos, podemos enfrentar esse apocalipse zumbi como uma verdadeira equipe dos Ghostbusters!\n",50);
                    Mensageiro.exibirMensagem("\n E lembrem-se, como disse Robin Williams em Dead Poets Society: Carpe diem. Aproveitem o dia, meninos!\n", 50);
                    mochila.adicionarItem("Mensagem do Governo");
                    Mensageiro.exibirMensagem("\n__________________________________________________________\n", 100);
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
            case 2:
                Mensageiro.exibirMensagem("Para passar a noite você precisa preparar o um sistema de segurança, resolva o seguinte: Se um sensor é ativado a cada 5 segundos e você tem 6 sensores, quantas ativações ocorrem em 1 minuto?", 50);
                resposta = scanner.nextLine();
                if (resposta.equals("72")) {
                    Mensageiro.exibirMensagem("Correto! Você configurou o sistema de segurança.", 50);
                    mochila.adicionarItem("Sistema de Segurança");
                } else {
                    Mensageiro.exibirMensagem("Resposta incorreta. Tente novamente.", 50);
                    return;
                }
                break;
                
        }           
        cantosResolvidos[indice] = true;
    }
    
}
