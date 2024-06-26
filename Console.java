import java.util.Scanner; 

public class Console {

    // Declara um objeto Scanner estático para ler entradas do console
    private static Scanner leitor = new Scanner(System.in);

    // Método estático para ler um número inteiro do console
    public static int lerInt(String mensagem) {
        System.out.print(mensagem); 
        while (!leitor.hasNextInt()) { 
            System.out.println("\nEntrada inválida. Por favor, insira um número inteiro.");
            leitor.next(); 
            System.out.print(mensagem);
        }
        int valor = leitor.nextInt();
        leitor.nextLine(); 
        return valor; 
    }

    // Método estático para ler uma string do console
    public static String lerString(String mensagem) {
        System.out.print(mensagem);
        return leitor.nextLine();
    }

    // Método estático para fechar o Scanner
    public static void fechar() {
        leitor.close();
    }

    // Método estático para ler a próxima linha de entrada do console
    public static String nextLine() {
        return leitor.nextLine();
    }
}
