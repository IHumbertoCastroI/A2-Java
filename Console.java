import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!leitor.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            leitor.next(); // Limpa a entrada inválida
            System.out.print(mensagem);
        }
        int valor = leitor.nextInt();
        leitor.nextLine(); // Limpa a linha
        return valor;
    }

    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }

    public static void fechar() {
        leitor.close();
    }

    public static String nextLine() {
        return leitor.nextLine();
    }
}
