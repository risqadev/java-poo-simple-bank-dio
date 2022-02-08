
public class Main {
	
	public static void main(String[] args) {
		Banco rBank = new Banco(254, "rBank");
		
		Agencia ag1 = new Agencia(rBank, "Agencia Centro", new Endereco("Rua Astolfo Sardinha", 1234));
		Agencia ag2 = new Agencia(rBank, "Agencia Bras", new Endereco("Av. Godofredo Lambuja", 9876));
				
		Cliente cliente1 = new Cliente(23409876400l, "Fulano de Tal");
		Cliente cliente2 = new Cliente(12365478910l, "Ciclano da Quinta");
		
		Conta conta1c = new ContaCorrente(ag1, cliente1);
		Conta conta2p = new ContaPoupanca(ag2, cliente2);
		
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
