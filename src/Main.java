public class Main {
    public static void main(String[] args) {
        
        Cliente dinarte = new Cliente();
        dinarte.setNome("Venilton");
        
        Conta cc = new ContaCorrente(dinarte);
        Conta poupanca = new ContaPoupanca(dinarte);
        
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}