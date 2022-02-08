
public abstract class Conta implements IConta {
	
	private static int SEQUENCIAL = 1;
	
	protected Agencia agencia;
	protected int numero;
	protected String tipo;
	protected double saldo = 0d;
	protected Cliente cliente;
	

	public Conta(Agencia agencia, Cliente cliente) {
		this.agencia = agencia;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public Agencia getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void imprimirSaldo() {
		System.out.println(String.format("Saldo de %s", this.tipo));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia.getNumero()));
		System.out.println(String.format("Conta nº: %d", this.numero));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));
		System.out.println();
	}
	
}
