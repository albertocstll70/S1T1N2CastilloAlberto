package s1t1n2exercici1;

public class Telefono {
	
	private String marca;
	private String modelo;
	
	
	public Telefono(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public void llamar(String numero) {
		
		System.out.println("Se esta llamando al número: "+numero);
		
	}
	
	
}
