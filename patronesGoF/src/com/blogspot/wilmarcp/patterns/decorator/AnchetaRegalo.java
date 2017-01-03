package com.blogspot.wilmarcp.patterns.decorator;

public abstract class AnchetaRegalo {

	public String descripcion;

	public String getDescripcion(){
		return descripcion;
	}

	public abstract double costo();
}
