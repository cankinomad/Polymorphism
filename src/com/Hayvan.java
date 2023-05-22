package com;

public class Hayvan {
	
	private String ad;
	private int kilo;
	private int boy;
	
	public void sesCikar() {
	System.out.println("----------");	//ortak ozellik ama her hayvan farkli ses cikariar o yuzden metodu override edip duzenlemelerini o sinifta yapiyorsun
	}
	
	
	public Hayvan(String ad, int kilo, int boy) {
		super();
		this.ad = ad;
		this.kilo = kilo;
		this.boy = boy;
	}


	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}
	
	
}
