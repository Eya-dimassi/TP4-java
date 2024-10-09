package ex9;

public class Mot_dict {
	private String Mot;
	private String Def;
	String getMot() {
		return Mot;
	}
	String getDef() {
		return Def;
	}
	public void setDef(String Def) {
		this.Def=Def;
	}
	public void setMot(String m) {
		this.Mot=m;
	}
    Boolean synonyme(String autre ) {
    	return Mot.equals(autre);
    }
	

}
