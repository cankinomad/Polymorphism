package com;

public class Kus extends Hayvan {

	public Kus(String ad, int kilo, int boy) {
		super(ad, kilo, boy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		System.out.println(getAd()+" Cikcik dedi");
	}

}
