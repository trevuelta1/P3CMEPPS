package session3;

public class Cuenta {

	private double saldo;
	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}
	public void Ingresar(double i) {
		this.saldo = this.saldo + i;
	}
	public void Retirar(double i) {
		this.saldo = this.saldo - i;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
