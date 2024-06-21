public class Mensageiro {
     
    public static void exibirMensagem(String mensagem, int delay) {
        
        for (char ch : mensagem.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
