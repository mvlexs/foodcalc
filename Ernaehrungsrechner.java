package flori;

public class Ernaehrungsrechner {
	/*int alter = Fenster.getAlter();
	int größe = Fenster.getGröße();
	int gewicht = Fenster.getGewicht();*/
	double kaloBedarf;
	double eiwBedarf;
	double khBedarf;
	double fettBedarf;
	public double kaloZunahme;
	public double eiwZunahme;
	public double khZunahme;
	public double fettZunahme;
	
	
	public Ernaehrungsrechner(int alter, int größe, int gewicht, double kaloBedarf, double eiwBedarf, double khBedarf, double fettBedarf, double kaloZunahme, double eiwZunahme, double khZunahme, double fettZunahme) {
		this.eiwBedarf = eiwBedarf;
		this.eiwZunahme = eiwZunahme;
		this.fettBedarf = fettBedarf;
		this.fettZunahme = fettZunahme;
		this.kaloBedarf = kaloBedarf;
		this.kaloZunahme = kaloZunahme;
		this.khBedarf =	khBedarf;
		this.khZunahme = khZunahme;
		/*this.alter = alter;
		this.größe = größe;
		this.gewicht = gewicht;*/
	}
	
	//Ernaehrungsrechner rechner1 = new Ernaehrungsrechner();
	
	public double berechneKaloZunahme() {
		
		return kaloZunahme;
	}
	
	public  double getKaloZunahme() {
		return kaloZunahme;
	}
	
}
