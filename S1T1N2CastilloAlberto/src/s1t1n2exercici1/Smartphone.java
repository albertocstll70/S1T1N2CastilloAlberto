package s1t1n2exercici1;

public class Smartphone extends Telefono implements ICamara, IReloj {

	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
		
	}

	@Override
	public void alarma() {
	System.out.println("Está sonando la alarma");

	}

	@Override
	public void fotografiar() {
	System.out.println("Se está haciendo una foto");

	}

}
