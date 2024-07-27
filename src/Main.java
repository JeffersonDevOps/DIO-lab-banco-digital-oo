//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta cc = new ContaCorrente(cliente);
        Conta cPoupanca = new ContaPoupanca(cliente);

        cliente.setNome("Jefferson");
        cc.depositar(100);
        cc.transferir(100, cPoupanca);
        cc.imprimirExtrato();
        cPoupanca.imprimirExtrato();
    }
}