package com;

public class Bakici {
	
	public void hayvanKonustur(Hayvan h1, int konusmaSayisi) {
		System.out.println("---hayvan3KezKonustur");
		for (int i = 0; i < konusmaSayisi; i++) {
			h1.sesCikar();
		}
	}
}
