package session3;

import java.util.List;

public class Cuenta {

	private double saldo;
	private List<Movimiento> movimientos;
	public Cuenta(double saldo, List<Movimiento> movimientos) {
		super();
		this.saldo = saldo;
		this.movimientos = movimientos;
	}
	public void Ingresar(double i) {
		this.saldo = this.saldo + i;
		Movimiento e = new Movimiento(i, Movimiento.Signo.H, "Ingreso");
		movimientos.add(e);
	}
	public void Retirar(double i) {
		if(i <= this.saldo) {
			this.saldo = this.saldo - i;
			Movimiento e = new Movimiento(i, Movimiento.Signo.D, "Retirada");
			movimientos.add(e);
		} else {
			Movimiento e = new Movimiento(0, Movimiento.Signo.E, "Intento erróneo de retirada");
			movimientos.add(e);
		}
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public List<Movimiento> getMovimientos(){
		return this.movimientos;
	}
}
