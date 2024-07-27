public class ContaPoupanca extends Conta {
    //Metodos
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupanca ====");
        imprimirInfosComuns();
    }
}
