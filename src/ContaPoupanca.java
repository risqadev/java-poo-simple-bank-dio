
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
		super.tipo = "Conta Poupanca";
	}
	
}
