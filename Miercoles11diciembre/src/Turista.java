
public class Turista {

	private String nombre;
	private String apellido;

	public Turista(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	private Maleta1 maleta1;

	public Maleta1 getMaleta1() {
		return maleta1;
	}

	public void setMaleta1(Maleta1 maleta1) {
		this.maleta1 = maleta1;
	}

	public Maleta2 getMaleta2() {
		return maleta2;
	}

	public void setMaleta2(Maleta2 maleta2) {
		this.maleta2 = maleta2;
	}

	private Maleta2 maleta2;

	public double getSumapeso() {
		double pesototal = 0;
		if (maleta1 != null)
			pesototal = pesototal + maleta1.getPeso();
		if (maleta2 != null)
			pesototal = pesototal + maleta2.getPeso();
		return pesototal;

	}

	public double getSumapeso(double sobrepeso) {
		return getSumapeso() + sobrepeso;
	}

	public double pesototal(String tipoMaleta) {
		double pesototal = getSumapeso();
		
		if (tipoMaleta.equals("dura")) {
			pesototal = pesototal + 4;
		} else {
			pesototal = pesototal + 2;

		}
		return pesototal;
	}
}
