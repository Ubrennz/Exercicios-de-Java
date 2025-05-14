import entities.Conta;
import entities.ContaNegocios;
import entities.ContaPoupanca;

public class Ex049 {
    public static void main(String[] args) {
        Conta conta = new ContaNegocios(1, "Eduardo", 1230.00, 550.00);
        ContaNegocios contaNegocios = new ContaNegocios(2, "Ana", 1678.00, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(3, "Gustavo", 2010.00, 5.00);
        Conta conta2 = new ContaPoupanca(4, "Flora", 12345.00, 5.00);

        // Upcasting
        Conta novaConta = contaNegocios;
        System.out.println(novaConta);

        Conta novaConta2 = contaPoupanca;
        System.out.println(novaConta2);

        // DownCasting
        ContaNegocios novaContaNegocios = (ContaNegocios) conta;
        System.out.println(novaContaNegocios.toString());

        ContaPoupanca novaContaPoupanca = (ContaPoupanca) conta2;
        System.out.println(novaContaPoupanca.toString());

    }
}
