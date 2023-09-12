 package ControleDePedidos;

 import java.util.Scanner;
 
public class ControleDePedidos {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner (System.in);
	

	CadastroCliente ccliente = new CadastroCliente ();
	

		System.out.println("จจจจจจจจจจจจจจจจจจจ TI New จจจจจจจจจจจจจจจจจจจ");
		
		//cadastro de clientes
		
		System.out.println("Nome do cliente: ");
		ccliente.setNome(in.nextLine());
		System.out.println("Telefone do cliente:");
		ccliente.setTelefone(in.nextLine());
		System.out.println("CPF do cliente:");
		ccliente.setCpf(in.nextLine());
		System.out.println("----------------------------------------------");
		
		//Produtos e pedidos
		
		
	CadastroProdutos cprodutos = new CadastroProdutos ();
	double totalDaCompra;
	int quantidadeDeProdutos;
	
		System.out.println("จจจจจจจจจจจจจจจ CATมLOGO DE PRODUTOS: จจจจจจจจจจจจจจจ");
		System.out.println("Unidade do suco de uva 600ml: R$5,00");
		System.out.println("Unidade do suco de laranja de uva 600ml: R$6,00");
		System.out.println("Unidade do suco de goiaba 600ml: R$4,00");			  
		System.out.println("Unidade do suco de limใo 600ml: R$4,00");					

				
			
			
		
		
	}
}
