### A2 - Projeto em Java

Este repositório contém o código-fonte de um projeto de java para uma avaliação da faculdade: Universidade Positivo.


#### Informações Gerais sobre o Projeto:

Um text-rpg cheio de referencias, composto de puzzles de matemática que levam o jogador a viver uma aventura linear. é possivel salvar o jogo e carregar ele novamente, voltando na sala em que o jogador salvou e todos os "itens" que ele ja coletou.

#### Como Executar o Projeto:

No Vscode o proprio Java debugger vai fazer o trabalho. Só executar.

#### Uso do ChatGPT:

- Ajuda na criação da classe "Mensageiro", em como criar o efeito de typing para o nosso jogo.
- Como Utilizar e criar as Interfaces "Saveavle" e "Renderable".
- Criação de uma classe "LimpaTerminal" para limpar o terminal conforme o jogo acontece.
- Como Salvar o progresso e armazenar os dados no arquivo txt e depois carrega-los novamente.
- Geração de PixelArts para usar no código

#### Funcionalidades Principais:

- Console: A classe "Console" facilita a leitura de entradas do usuário, oferecendo métodos estáticos para ler inteiros, strings, e fechar o Scanner. Além disso, possui um método para ler a próxima linha de entrada.
  
- Display: A classe "Display" gerencia uma lista de componentes renderizáveis, permitindo adicionar componentes e renderizá-los todos após limpar o terminal.
  
- LimpaTerminal: A classe LimpaTerminal possui o método estático, que limpa o terminal executando o comando no Windows ou usando sequências de escape ANSI em outros sistemas operacionais, com tratamento de exceções.
  
- Main: A classe "Main"  permite iniciar, carregar ou sair do jogo, usando Mensageiro para exibir mensagens, Console para ler entradas, e manipulação de arquivos para salvar e carregar o estado do jogo.
  
- Mensageiro: A classe "Mensageiro" possui um método estático exibirMensagem que imprime uma string caractere por caractere com um delay específico entre cada um, usando "Thread.sleep" para pausar a execução.
  
- Mochila: A classe "Mochila" gerencia uma lista de itens, permitindo adicionar, salvar e carregar esses itens de/para um arquivo, além de renderizar sua representação no console.
  
- Personagem: A classe "Personagem" representa um personagem com atributos de nome, idade e profissão, permitindo salvar e carregar esses dados de/para um arquivo, além de renderizar sua representação no console.
  
- Renderable: A interface "Renderable" define um contrato para classes que implementam o método "renderizar()", responsável por renderizar.

- Sala: A classe abstrata "Sala" define salas genéricas com nome, cantos a serem resolvidos e métodos para salvar, carregar e renderizar seu estado, permitindo subclasses implementarem a resolução específica de cantos.

- SalaCasaDoProgramador: A classe "SalaCasaDoProgramador" estende para "Sala", implementando métodos para resolver cantos específicos da sala, como inspecionar o computador e preparar um sistema de segurança, com interação através de mensagens exibidas com delay.

- SalaEstacaoMetro: A classe "SalaEstacaoMetro" estende para "Sala", permitindo resolver cantos específicos de uma estação de metrô, como restaurar energia, operar sistemas de portas e explorar túneis, com interações baseadas em respostas corretas a perguntas.

- SalaHospitalAbandonado: A classe "SalaHospitalAbandonado" estende "Sala", permitindo resolver cantos específicos de um hospital abandonado, como acessar registros médicos, descobrir localização de suprimentos e ajudar sobreviventes, com interações baseadas em respostas corretas a perguntas.

- SalaRefugioSeguro: A classe "SalaRefugioSeguro" permite resolver diferentes tarefas em um refúgio seguro, como fortificar o local, estocar mantimentos e coordenar sobreviventes, com interações baseadas em respostas corretas a perguntas específicas.

- SalaRuaDeserta: A classe "SalaRuaDeserta" permite resolver desafios em uma rua deserta, incluindo análise de mapas online, evitação de áreas de alto risco e planejamento de rotas seguras, com base em respostas corretas a enigmas específicos.

- Saveable: A classe "Saveable" define métodos para salvar e carregar objetos.
  
#### Projeto feito em:

- JAVA

#### Autores:

- Humberto Camargo de Castro
- Caio Labes de Castro
- Victor Gabriel Purkott Coelho
- Lucas Affonso Purkott Zelleroff

##### Esperamos que gostem!
