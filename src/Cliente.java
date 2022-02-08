
public class Cliente {
	
	private String nome;
	private long cpf;
	private Endereco endereco;
	
	public Cliente(long cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public long getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return nome;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
