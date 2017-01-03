package com.blogspot.wilmarcp.patterns.decorator;

public class AnchetaMatrimonio extends AnchetaRegalo{

	public AnchetaMatrimonio(){
		descripcion = "Ancheta ideal para regalar en Matrimonio.";
	}

	@Override
	public double costo() {
		return 2.5;
	}
}