public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super();
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("--- Extrato Conta Corrente ---");
        super.imprimirExtrato();
    }
}