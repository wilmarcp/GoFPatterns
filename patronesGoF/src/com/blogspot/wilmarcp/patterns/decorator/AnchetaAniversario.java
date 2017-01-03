package com.blogspot.wilmarcp.patterns.decorator;

public class AnchetaAniversario extends AnchetaRegalo{

	public AnchetaAniversario(){
		descripcion = "Ideal para que sorprendas a tu pareja en fecha especial";
	}

	@Override
	public double costo() {
		return 1.9;
	}
}