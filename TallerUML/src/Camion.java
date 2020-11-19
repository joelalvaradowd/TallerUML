import java.util.List;

public class Camion extends VehiculoPesado {

	private int numRuedas ;
	private int capRemolque;
	private String gradoLicencia;
	private List<Remolque> remolques;
	
	public int getNumRuedas() {
		return numRuedas;
	}
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public int getCapRemolque() {
		return capRemolque;
	}
	public void setCapRemolque(int capRemolque) {
		this.capRemolque = capRemolque;
	}
	public String getGradoLicencia() {
		return gradoLicencia;
	}
	public void setGradoLicencia(String gradoLicencia) {
		this.gradoLicencia = gradoLicencia;
	}
	public List<Remolque> getRemolques() {
		return remolques;
	}
	public void setRemolques(List<Remolque> remolques) {
		this.remolques = remolques;
	}
	
	
}
