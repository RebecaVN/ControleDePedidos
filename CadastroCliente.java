package ControleDePedidos;

public class CadastroCliente {
	
	private String CadastroCliente [][] = new String [3][4];
	private String nome;
	private String cpf;
	private String telefone;
	
	public String[][] getCadastroCliente() {
		return CadastroCliente;
	}
	public void setCadastroCliente(String[][] cadastroCliente) {
		CadastroCliente = cadastroCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

	
	
}
