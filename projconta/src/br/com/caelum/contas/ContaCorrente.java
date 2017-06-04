package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;

	public class ContaCorrente extends Conta{
		public String getTipo(){
			return "Conta Corrente";
		}
		@Override
		public void saca(double valor){
//			double ret = valor * 1.1;	//Taxa de saque 10% do valor do saque;
			double ret = valor + 0.1;	//Taxa de saque 10 centavos do saldo;
			super.saca(ret);
		}
	}
