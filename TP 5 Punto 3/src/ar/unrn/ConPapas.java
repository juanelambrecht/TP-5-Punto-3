package ar.unrn;

public class ConPapas implements Pedido{
	String nombreDelAdicional;
	double precio;
	Pedido pedido;

	public ConPapas(String nombreDelAdicional, double precio, Pedido pedido) {
		super();
		this.nombreDelAdicional = nombreDelAdicional;
		this.precio = precio;
		this.pedido = pedido;
	}


	@Override
	public double valor() {
		return pedido.valor() + this.precio;
	}
	@Override
	public String nombreProducto() {
		return pedido.nombreProducto() + "| Adicional -> " + this.nombreDelAdicional;
	}


	@Override
	public void mostrarDescripcionPedido() {
		System.out.println(this.nombreProducto());
		System.out.println(this.valor());
	}

}
