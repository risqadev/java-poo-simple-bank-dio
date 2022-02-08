
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirSaldo() {
		
		System.out.println("=== Saldo de conta corrente ===");
		
		super.imprimirInformacoes();
		
	}
	
}
