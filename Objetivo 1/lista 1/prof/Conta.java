public class Conta {
	
	public double saldo;
	public double limite;
	public String numero;
	
	public Conta(String numero, double limite, double saldo){
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public Conta(){
		this.numero = "1111-1";
		this.saldo = 0.0;
		this.limite = 500.0;
	}
	
	public Conta(String numero){
		this.numero = numero;
		this.saldo = 10.0;
		this.limite = 100.0;
	}
	
	public void creditar(double valor){
			this.saldo += valor;
		
	}
	
	public boolean debitar(double valor){
		
		boolean retorno = false;
		
		if(saldo < valor){
			System.out.println("Operação ilegal.");
		}else{
			saldo = saldo - valor;
			retorno = true;
		}
		
		return retorno;
	}
	
	public void transferir(double valor, Conta contaDestino){
		
		if(this.debitar(valor)){	
			contaDestino.creditar(valor);
		}else{
			System.out.println("Operação inválida.");
		}
		
	}
	
	public double getSaldo(){
	    return saldo;
	}
	
	@Override
	public String toString() {
	    return "\nConta [Numero= " + numero + " Saldo= " + saldo + " Limite= " + limite + "]";
	}

}
