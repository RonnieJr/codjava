package br.com.caelum.contas.modelo;

public class Conta{
	protected double saldo;
	private	String titular;
	private	int numero;
	private String agencia;
	public String getTipo(){
		return "Conta";
	}

//CONSTRUTOR
	/*public Conta(String titular){
		this.titular = titular;
	}*/

//METODOS
	public void transfere(double valor, Conta conta){
		this.saca(valor);
		conta.deposita(valor);
	}
	
	public void deposita(double valorDigitado){
		if(valorDigitado>0){
			saldo+=valorDigitado;
		}
	}

	public void saca(double valorDigitado){
		if(valorDigitado<=saldo){		
			saldo-=valorDigitado;
		}
	}

//GET/SET
	// G/S Titular
	public String getTitular(){
		return this.titular;
	}

	public void setTitular(String nome){
		this.titular = nome;
	}

	// G/S Numero
	public int getNumero(){
		return this.numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	// G/S Agência
	public String getAgencia(){
		return this.agencia;
	}

	public void setAgencia(String agencia){
		this.agencia = agencia;
	}

	// G/S Saldo
	public double getSaldo(){
		return this.saldo;
	}
/*	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
*/
}