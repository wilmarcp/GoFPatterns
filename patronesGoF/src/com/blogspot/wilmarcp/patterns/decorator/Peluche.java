package com.blogspot.wilmarcp.patterns.decorator;

public class Peluche extends IngredientesRegaloDecorator{

	private AnchetaRegalo ancheta;

	public Peluche(AnchetaRegalo ancheta){
		this.ancheta = ancheta;
	}

	@Override
	public String getDescripcion() {
		return this.ancheta.getDescripcion() + ", Peluche tierno de tamaño medio.";
	}

	@Override
	public double costo(){
		return ancheta.costo() + 5;
	}
}