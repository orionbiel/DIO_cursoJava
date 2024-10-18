import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Por favor, agora digite a Agência!");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome completo!");
        String nomeCompleto = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " +nomeCompleto+", obrigado por criar uma conta em nosso banco, sua agência é  "+numeroAgencia+", conta "+numeroConta+" e seu saldo de "+saldo+" já está disponível para saque.");

    }
}