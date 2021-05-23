package ar.unrn.main;

import ar.unrn.ComboBasico;
import ar.unrn.ComboEspecial;
import ar.unrn.ConCarne;
import ar.unrn.ConPapas;
import ar.unrn.ConQueso;
import ar.unrn.ConTomate;
import ar.unrn.Pedido;

public class Main {

	public static void main(String[] args) {
		Pedido pedidoComboBasico = new ConTomate("Tomate cherry", 50,
				new ConPapas("Papas fritas", 70, new ComboBasico("Doble Hamburguesa + gaseosa", 300)));

		pedidoComboBasico.mostrarDescripcionPedido();

		Pedido pedidoComboEspecial = new ConCarne("Carne en trozos", 150, new ConQueso("Queso chedar", 40,
				new ComboEspecial("Triple Hamburguesa + 2 gaseosa + Papas fritas", 600)));

		pedidoComboEspecial.mostrarDescripcionPedido();

	}

}
