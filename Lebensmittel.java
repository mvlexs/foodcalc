package flori;
	
public class Lebensmittel {

	private final String name;
	private final int kalorien;
	private final int eiweiße;
	private final int fett;
	private final int kolenhydrate;
	
	public Lebensmittel(String name, int kalorien, int eiweiße, int fett, int kolenhydrate) {
		this.name = name;
		this.kalorien = kalorien;
		this.eiweiße = eiweiße;
		this.fett = fett;
		this.kolenhydrate = kolenhydrate;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKalorien() {
		return kalorien;
	}
	
	public int getEiweiße() {
		return eiweiße;
	}
	
	public int getFett() {
		return fett;
	}
	
	public int getKolenhydrate() {
		return kolenhydrate;
	}
	
	public Lebensmittel haferflocken = new Lebensmittel("Haferflocken", 340, 10, 7, 55);
	
	public Lebensmittel milch = new Lebensmittel("Milch", 60, 3, 4, 5);

	public Lebensmittel nudeln = new Lebensmittel("Nudeln", 140, 5, 1, 30);

	public Lebensmittel erdnussbutter = new Lebensmittel("Erdnussbutter", 630, 25, 50, 14);

	public Lebensmittel quark = new Lebensmittel("Quark", 110, 10, 5, 3);

	public Lebensmittel brot = new Lebensmittel("Brot", 250, 8, 2, 50);

	public Lebensmittel reis = new Lebensmittel("Reis", 350, 7, 1, 80);

	public Lebensmittel hühnchen = new Lebensmittel("Hühnchen", 160, 20, 10, 0);

	public Lebensmittel erbsen = new Lebensmittel("Erbsen", 80, 7, 0, 10);

	public Lebensmittel brokkoli = new Lebensmittel("Brokkoli", 20, 3, 0, 2);

	public Lebensmittel wurst = new Lebensmittel("Wurst", 200, 20, 30, 0);

	public Lebensmittel butter = new Lebensmittel("Butter", 740, 1, 80, 1);

	public Lebensmittel käse = new Lebensmittel("Käse", 300, 30, 20, 0);

	public Lebensmittel tofu = new Lebensmittel("Tofu", 150, 15, 10, 1);

	public Lebensmittel fisch = new Lebensmittel("Fisch", 200, 20, 15, 0);

	public Lebensmittel rindfleisch = new Lebensmittel("Rindfleisch", 150, 20, 10, 0);
	
	//haferflocken getter
	public int getHaferflockenFett() {
	
		return haferflocken.fett;
		
	}
	
	public int getHaferflockenEiweiße() {
		
		return haferflocken.eiweiße;
				
	}
	
	public int getHaferflockenKohlenhydrate() {
		
		return haferflocken.kolenhydrate;
				
	}
	
	public int getHaferflockenKalorien() {
		
		return haferflocken.kalorien;
				
	}
	
	//milch getter
	public int getMilchFett() {
		
		return milch.fett;
		
	}
	
	public int getMilchEiweiße() {
		
		return milch.eiweiße;
				
	}
	
	public int getMilchKohlenhydrate() {
		
		return milch.kolenhydrate;
				
	}
	
	public int getMilchKalorien() {
		
		return milch.kalorien;
				
	}
	
	//erdnussbutter getter
	public int getErdnussbutterFett() {
	
		return erdnussbutter.fett;
		
	}
	
	public int getErdnussbutterEiweiße() {
		
		return erdnussbutter.eiweiße;
				
	}
	
	public int getErdnussbutterKohlenhydrate() {
		
		return erdnussbutter.kolenhydrate;
				
	}
	
	public int getErdnussbutterKalorien() {
		
		return erdnussbutter.kalorien;
				
	}
	
	//quark getter
	public int getQuarkFett() {
	
		return quark.fett;
		
	}
	
	public int getQuarkEiweiße() {
		
		return quark.eiweiße;
				
	}
	
	public int getQuarkKohlenhydrate() {
		
		return quark.kolenhydrate;
				
	}
	
	public int getQuarkKalorien() {
		
		return quark.kalorien;
				
	}
	
	//brot getter
	public int getBrotFett() {
	
		return brot.fett;
		
	}
	
	public int getBrotEiweiße() {
		
		return brot.eiweiße;
				
	}
	
	public int getBrotKohlenhydrate() {
		
		return brot.kolenhydrate;
				
	}
	
	public int getBrotKalorien() {
		
		return brot.kalorien;
				
	}
	
	//reis getter
	public int getReisFett() {
		
		return reis.fett;
		
	}
	
	public int getReisEiweiße() {
		
		return reis.eiweiße;
				
	}
	
	public int getReisKohlenhydrate() {
		
		return reis.kolenhydrate;
				
	}
	
	public int getReisKalorien() {
		
		return reis.kalorien;
				
	}
	
	//nudeln getter
	public int getNudelnFett() {
	
		return nudeln.fett;
		
	}
	
	public int getNudelnEiweiße() {
		
		return nudeln.eiweiße;
				
	}
	
	public int getNudelnKohlenhydrate() {
		
		return nudeln.kolenhydrate;
				
	}
	
	public int getNudelnKalorien() {
		
		return nudeln.kalorien;
				
	}
	
	//hühnchen getter
	public int getHühnchenFett() {
	
		return hühnchen.fett;
		
	}
	
	public int getHühnchenEiweiße() {
		
		return hühnchen.eiweiße;
				
	}
	
	public int getHühnchenKohlenhydrate() {
		
		return hühnchen.kolenhydrate;
				
	}
	
	public int getHühnchenKalorien() {
		
		return hühnchen.kalorien;
				
	}
	
	//erbsen getter
	public int getErbsenFett() {
	
		return erbsen.fett;
		
	}
	
	public int getErbsenEiweiße() {
		
		return erbsen.eiweiße;
				
	}
	
	public int getErbsenKohlenhydrate() {
		
		return erbsen.kolenhydrate;
				
	}
	
	public int getErbsenKalorien() {
		
		return erbsen.kalorien;
				
	}
	
	//brokkoli getter
	public int getBrokkoliFett() {
		
		return brokkoli.fett;
		
	}
	
	public int getBrokkoliEiweiße() {
		
		return brokkoli.eiweiße;
				
	}
	
	public int getBrokkoliKohlenhydrate() {
		
		return brokkoli.kolenhydrate;
				
	}
	
	public int getBrokkoliKalorien() {
		
		return brokkoli.kalorien;
				
	}
	
	//wurst getter
	public int getWurstFett() {
	
		return wurst.fett;
		
	}
	
	public int getWurstEiweiße() {
		
		return wurst.eiweiße;
				
	}
	
	public int getWurstKohlenhydrate() {
		
		return wurst.kolenhydrate;
				
	}
	
	public int getWurstKalorien() {
		
		return wurst.kalorien;
				
	}
	
	//butter getter
	public int getButterFett() {
	
		return butter.fett;
		
	}
	
	public int getButterEiweiße() {
		
		return butter.eiweiße;
				
	}
	
	public int getButterKohlenhydrate() {
		
		return butter.kolenhydrate;
				
	}
	
	public int getButterKalorien() {
		
		return butter.kalorien;
				
	}
	
	//käse getter
	public int getKäseFett() {
	
		return käse.fett;
		
	}
	
	public int getKäseEiweiße() {
		
		return käse.eiweiße;
				
	}
	
	public int getKäseKohlenhydrate() {
		
		return käse.kolenhydrate;
				
	}
	
	public int getKäseKalorien() {
		
		return käse.kalorien;
				
	}
	
	//tofu getter
	public int getTofuFett() {
		
		return tofu.fett;
		
	}
	
	public int getTofuEiweiße() {
		
		return tofu.eiweiße;
				
	}
	
	public int getTofuKohlenhydrate() {
		
		return tofu.kolenhydrate;
				
	}
	
	public int getTofuKalorien() {
		
		return tofu.kalorien;
				
	}
	
	//fisch getter
	public int getFischFett() {
	
		return fisch.fett;
		
	}
	
	public int getFischEiweiße() {
		
		return fisch.eiweiße;
				
	}
	
	public int getFischKohlenhydrate() {
		
		return fisch.kolenhydrate;
				
	}
	
	public int getFischKalorien() {
		
		return fisch.kalorien;
				
	}
	
	//rindfleisch getter
	public int getRindfleischFett() {
	
		return rindfleisch.fett;
		
	}
	
	public int getRindfleischEiweiße() {
		
		return rindfleisch.eiweiße;
				
	}
	
	public int getRindfleischKohlenhydrate() {
		
		return rindfleisch.kolenhydrate;
				
	}
	
	public int getRindfleischKalorien() {
		
		return rindfleisch.kalorien;
				
	}
	
}
	
	