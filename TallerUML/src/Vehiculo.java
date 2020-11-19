import java.util.Date;

public class Vehiculo {

	private double numRegistro;
	private double capMotor;
	private Date fechaPrueba;
	private Fabricante fabricante;
	public double getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(double numRegistro) {
		this.numRegistro = numRegistro;
	}
	public double getCapMotor() {
		return capMotor;
	}
	public void setCapMotor(double capMotor) {
		this.capMotor = capMotor;
	}
	public Date getFechaPrueba() {
		return fechaPrueba;
	}
	public void setFechaPrueba(Date fechaPrueba) {
		this.fechaPrueba = fechaPrueba;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
