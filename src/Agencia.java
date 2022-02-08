
public class Agencia {
	
	private static int SEQUENCIAL = 1;
	
	private final Banco banco;
	private final int numero;
	private String nome;
	private Endereco endereco;
	
	public Agencia(Banco banco, String nome, Endereco endereco) {
		this.banco = banco;
		this.numero = SEQUENCIAL++;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Banco getBanco() {
		return banco;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
