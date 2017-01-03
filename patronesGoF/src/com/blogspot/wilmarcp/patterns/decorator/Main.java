package com.blogspot.wilmarcp.patterns.decorator;

public class Main {

	public static void main(String[] args) {
		AnchetaRegalo anchetaMatrimonio = new Chocolate(new Peluche(new Vino(new AnchetaMatrimonio())));
		System.out.println("Descripción: " + anchetaMatrimonio.getDescripcion());
		System.out.println("Precio: " + anchetaMatrimonio.costo());
	}
}
