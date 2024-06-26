import java.util.Scanner;

public class Console {

    private static Scanner leitor;

    public Console() {
        leitor = new Scanner(System.in);
    }

    public int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!leitor.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            leitor.next(); // Limpa a entrada inválida
            System.out.print(mensagem);
        }
        return leitor.nextInt();
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return leitor.next();
    }

    public void fechar() {
        leitor.close();
    }

    public static String nextLine() {
        return leitor.nextLine();
    }
}
