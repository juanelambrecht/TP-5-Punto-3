package ar.unrn;

public class ComboFamiliar implements Pedido{
	String nombreCombo;
	double precioTotal;
	
	public ComboFamiliar(String nombreCombo, double precioTotal) {
		super();
		this.nombreCombo = nombreCombo;
		this.precioTotal = precioTotal;
	}

	@Override
	public double valor() {
		return this.precioTotal;
	}


	@Override
	public String nombreProducto() {
		return this.nombreCombo;
	}

	@Override
	public void mostrarDescripcionPedido() {
		System.out.println(this.nombreProducto());
		System.out.println(this.valor());
	}

}
