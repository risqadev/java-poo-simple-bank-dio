
public class Endereco {
	
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private int cep;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco(String logradouro, int numero) {
		this.logradouro = logradouro;
		this.numero = numero;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

//	public void printEnderecoCompleto() {
//		System.out.println(String.format("%s, nº %d\n"
//			+ "%s"
//			+ "CEP: %d"
//			+ "%s - %s",
//			this.logradouro, this.numero, this.complemento, this.cep, this.cidade, this.cep, this.estado
//		));
//	}
	
}
