
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
		super.tipo = "Conta Corrente";
	}
	
}
