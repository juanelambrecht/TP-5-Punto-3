package ar.unrn;

public class ComboBasico implements Pedido{
	String nombreCombo;
	double precioTotal;
	
	public ComboBasico(String nombreCombo, double precioTotal) {
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
