package session3;

public class Movimiento {
	private double importe;
	public enum Signo{D, H, E};
	private Signo signo;
	private String detalle;
	public Movimiento(double importe, Signo signo, String detalle) {
		this.importe = importe;
		this.signo = signo;
		this.detalle = detalle;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Signo getSigno() {
		return signo;
	}
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	public String toString() {
		return "Movimiento tipo " + this.signo + " de " + this.importe + "€. Detalle: " + this.detalle + ".";
	}
}
