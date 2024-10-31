package entities;

public class ContaBancaria {
	// criando atributos
	private int number;
	private String titular;
	private double saldo;
	
	// construtor padrão
	public ContaBancaria(){};
	
	// construtor personalizado
	public ContaBancaria(int number, String titular) {
		this.number = number;
		this.titular = titular;
	};
		
	// criando get e set
	public int getNumber() {
		return number;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// metodos 
	
	// função para alterar o saldo caso tenha deposito
	public void deposit(double value) {
		saldo += value;
	}
	// função para alterar o saldo caso tenha saque e com 5 reais de taxa
	public void withDraw(double value) {
		saldo = (saldo - value) - 5;
	}
	// função para formatar o print do objeto
	public String toString() {
		return "Account " 
	    + this.number + "," + " Titular: " 
		+ this.titular + "," + " Balance: $ " + this.saldo;
		
	}
	
	
	
	
	
	
	
	
	
	
}
