
public class Permanente extends Empleado{
	private int seguroSocial;
	private float salario;
	private Empleado referencias;
	public int getSeguroSocial() {
		return seguroSocial;
	}
	public void setSeguroSocial(int seguroSocial) {
		this.seguroSocial = seguroSocial;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public Empleado getReferencias() {
		return referencias;
	}
	public void setReferencias(Empleado referencias) {
		this.referencias = referencias;
	}
}
