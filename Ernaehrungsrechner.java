package flori;

public class Ernaehrungsrechner {
	/*int alter = Fenster.getAlter();
	int größe = Fenster.getGröße();
	int gewicht = Fenster.getGewicht();*/
	static double kaloBedarf;
	static double eiwBedarf;
	static double khBedarf;
	static double fettBedarf;
	static public double kaloZunahme;
	static public double eiwZunahme;
	static public double khZunahme;
	static public double fettZunahme;
	
	
	public Ernaehrungsrechner(int alter, int größe, int gewicht, double kaloBedarf, double eiwBedarf, double khBedarf, double fettBedarf, double kaloZunahme, double eiwZunahme, double khZunahme, double fettZunahme) {
		Ernaehrungsrechner.eiwBedarf = eiwBedarf;
		Ernaehrungsrechner.eiwZunahme = eiwZunahme;
		Ernaehrungsrechner.fettBedarf = fettBedarf;
		Ernaehrungsrechner.fettZunahme = fettZunahme;
		Ernaehrungsrechner.kaloBedarf = kaloBedarf;
		Ernaehrungsrechner.kaloZunahme = kaloZunahme;
		Ernaehrungsrechner.khBedarf =	khBedarf;
		Ernaehrungsrechner.khZunahme = khZunahme;
		/*this.alter = alter;
		this.größe = größe;
		this.gewicht = gewicht;*/
	}
	
	//Ernaehrungsrechner rechner1 = new Ernaehrungsrechner();
	
	public static double berechneKaloZunahme() {
		kaloZunahme = Fenster.getHuhn()*160;
		return kaloZunahme;
	}
	
	public  double getKaloZunahme() {
		return kaloZunahme;
	}
	
}
