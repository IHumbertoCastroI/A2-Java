import java.util.Scanner;

public class Console {

    private Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public int lerInt(String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            scanner.next(); // Limpa a entrada inválida
            System.out.print(mensagem);
        }
        return scanner.nextInt();
    }

    public String lerString(String mensagem) {
        System.out.print(mensagem);
        return scanner.next();
    }

    public void fechar() {
        scanner.close();
    }

    public static String nextLine() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nextLine'");
    }
}
