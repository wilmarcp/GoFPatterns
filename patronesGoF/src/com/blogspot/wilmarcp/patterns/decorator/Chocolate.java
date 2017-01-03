package com.blogspot.wilmarcp.patterns.decorator;

public class Chocolate extends IngredientesRegaloDecorator{

	private AnchetaRegalo ancheta;

	public Chocolate(AnchetaRegalo ancheta){
		this.ancheta = ancheta;
	}

	@Override
	public String getDescripcion() {
		return this.ancheta.getDescripcion() + ", Chocolate blanco de 2 barras bajo en azucar.";
	}

	@Override
	public double costo() {
		return this.ancheta.costo() + 6.5;
	}
}
