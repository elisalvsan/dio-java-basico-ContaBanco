import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: importar classe Scanner

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Exibir as mensagens de solicitando informações ao usuário
        // Obter pelo Scanner os valores digitados

        System.out.println("Por favor, digite o número da Agência: ");
        numero = scan.nextInt();
        System.out.println("Por favor, digite qual a Agência: ");
        agencia = scan.next();
        System.out.println("Por favor, informe o seu Nome: ");
        nomeCliente = scan.next();
        System.out.println("Por favor, informe o seu Saldo: ");
        saldo = scan.nextDouble();

        // Exibir a mensagem de conta criada.

        System.out
                .println("Olá " + nomeCliente +
                        ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                        " já está disponível para saque.");

    }
}
