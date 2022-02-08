
public class Main {
	
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Fulano de Tal");
		Cliente cliente2 = new Cliente("Ciclano da Quinta");
		
		Conta conta1c = new ContaCorrente(cliente1);
		Conta conta2p = new ContaPoupanca(cliente2);
		
		conta1c.imprimirSaldo();
		conta2p.imprimirSaldo();
		
		
		System.out.println("Depositando R$ 1.000,00 na conta1c\n");
		
		conta1c.depositar(1000d);
		
		conta1c.imprimirSaldo();
		conta2p.imprimirSaldo();
		
		System.out.println("Transferindo R$ 650,00 da conta1c para conta2p\n");
		
		conta1c.transferir(650d, conta2p);
		
		conta1c.imprimirSaldo();
		conta2p.imprimirSaldo();
		
		System.out.println("Sacando R$ 300,00 da conta1c\n");
		
		conta1c.sacar(300d);
		
		conta1c.imprimirSaldo();
		conta2p.imprimirSaldo();
		
	}
	
}
