package br.uece.ees.visitor;

public abstract class Conta{

	protected double saldo;
	protected int numero;
	
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo=saldo;
	}

	public void mostrarDados(){
		System.out.println("Conta " + numero + ", saldo = " + saldo);
	}
	
	public abstract void atualiza(AtualizadorContaVisitor atualizadorConta);
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
