import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        int Numero;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor digite seu nome: ");
        NomeCliente = sc.nextLine();

        System.out.print("Por favor digite o nÃºmero de sua Agência: ");
        Agencia = sc.nextLine();

        System.out.print("Por favor digite o número da sua Conta: ");
        Numero = sc.nextInt();

        System.out.print("Por favor digite o valor do seu saldo: ");
        Saldo = sc.nextDouble();

        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está dispónivel para saque");

    }
}

