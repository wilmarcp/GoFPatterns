package com.blogspot.wilmarcp.patterns.decorator;


public class AnchetaAmorYAmistad extends AnchetaRegalo{

	public AnchetaAmorYAmistad(){
		descripcion = "Celebra y sorprende en amor y amistad con un gran regalo.";
	}

	@Override
	public double costo() {
		return 2.8;
	}
}