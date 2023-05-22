package com;

public class Runnner {

	public static void main(String[] args) {
		Kedi tekir = new Kedi("Tekir", 4, 60);
//		tekir.sesCikar();
		
		Kopek karabas=new Kopek("Karabas", 8, 110);
//		karabas.sesCikar();
//		
//		Hayvan h1=new Kedi("Tekir", 4, 60);
//		h1.sesCikar();
//		
//		h1=new Kopek("Karabas", 8, 110);
//		h1.sesCikar();
		
		Bakici bakici=new Bakici();	
		bakici.hayvanKonustur(karabas, 3);	//hayvan istiyor ve sen hayvanin alt sinifi olan kopek kedi veya kus verebiliyorsun. buna polymorphism 
		//deniyor.(tek tek metodda kedi kopek veya kus isteyecegine onlarin ana sinifi olan hayvani istiyorsun ve bitiyor)
		
	}

}
