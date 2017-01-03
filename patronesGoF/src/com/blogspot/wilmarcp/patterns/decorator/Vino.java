package com.blogspot.wilmarcp.patterns.decorator;

public class Vino extends IngredientesRegaloDecorator{

	private AnchetaRegalo ancheta;

	public Vino(AnchetaRegalo ancheta){
		this.ancheta = ancheta;
	}

	@Override
	public String getDescripcion() {
		return this.ancheta.getDescripcion() + ", Delicioso Vino Rosa para la perfecta ocasión";
	}

	@Override
	public double costo() {
		return this.ancheta.costo() + 20;
	}
}