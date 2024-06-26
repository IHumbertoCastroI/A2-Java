public class Mensageiro {

    // Método estático para exibir uma mensagem com um delay entre cada caractere
    public static void exibirMensagem(String mensagem, int delay) {
        
        // Percorre cada caractere da mensagem
        for (char ch : mensagem.toCharArray()) {
            System.out.print(ch);
            
            try {
                Thread.sleep(delay); // Pausa a execução pelo tempo especificado em milissegundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
