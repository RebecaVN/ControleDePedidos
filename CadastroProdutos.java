package ControleDePedidos;

public class CadastroProdutos {
	
	private double CadastroProdutos [][] = new double [3][4];
	private double sucoUva;
	private double sucoLaranja;
	private double sucoGoiaba;
	private double sucoLimao;
	
	
	public double[][] getCadastroProdutos() {
		return CadastroProdutos;
	}
	public void setCadastroProdutos(double[][] cadastroProdutos) {
		CadastroProdutos = cadastroProdutos;
	}
	public double getSucoUva() {
		return sucoUva;
	}
	public void setSucoUva(double sucoUva) {
		this.sucoUva = sucoUva;
	}
	public double getSucoLaranja() {
		return sucoLaranja;
	}
	public void setSucoLaranja(double sucoLaranja) {
		this.sucoLaranja = sucoLaranja;
	}
	public double getSucoGoiaba() {
		return sucoGoiaba;
	}
	public void setSucoGoiaba(double sucoGoiaba) {
		this.sucoGoiaba = sucoGoiaba;
	}
	public double getSucoLimão() {
		return sucoLimao;
	}
	public void setSucoLimão(double sucoLimão) {
		this.sucoLimao = sucoLimão;
	} 
	
	
	
}
	