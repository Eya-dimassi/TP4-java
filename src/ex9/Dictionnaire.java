package ex9;

public class Dictionnaire {
	private int nb_mots;
	private Mot_dict[]Dict;
	private String Nom;
	private int taille ;
	public Dictionnaire(int taille,String Nom) {
		
		Dict=new Mot_dict[taille];
		this.taille=taille;
		this.Nom=Nom;
		
	
	}
	public void Ajouter_Mot(Mot_dict m) {
		int i;
		if(taille==0) {
			m=Dict[0];
		}else {
			for( i=nb_mots-1;m.getMot().compareTo(Dict[i].getMot())<0;i--){
				Dict[i+1]=Dict[i];
			}
			Dict[i+1]=m;
			nb_mots++;
			
		}
		
	}
	public void Trier() { 
        Mot_dict tmp ;  
        for(int i=0; i < taille; i++) 
        {
                for(int j=1; j < (taille-i); j++)
                {  
                        if(Dict[j-1].getMot().compareTo(Dict[j].getMot())>0)
                        {
                                tmp = Dict[j-1];  
                                Dict[j-1] = Dict[j];  
                                Dict[j] = tmp;  
                        }
 
                }
        }
		
		
		
	}
	public void Supprimer_Mot(Mot_dict m) {
		int p=-1;
		for(int i=0;i<nb_mots;i++) {
			if(Dict[i].getMot().equals(m.getMot())) {
				p=i;
				
			}
		}
		if (p != -1) {
            for (int i = p; i < nb_mots - 1; i++) {
                Dict[i] = Dict[i + 1];
            }
            Dict[nb_mots - 1] = null; 
        } else {
            System.out.println("Mot non trouvé dans le dictionnaire.");
        }

		
		
		
	}
	String Recherche_dicho (String m) {
		int g = 0;
	    int d= nb_mots - 1;

	    while (g <= d) {
	        int milieu = (g + d) / 2;
	        String motMilieu = Dict[milieu].getMot();
	        if (motMilieu.equals(m)) {
	            return Dict[milieu].getDef(); 
	        } else if (motMilieu.compareTo(m) < 0) {
	            g= milieu + 1; 
	        } else {
	            d= milieu - 1; 
	        }
	    }

	    return "Mot non trouvé dans le dictionnaire";
		
	}

	public void Lister_dicho() {
		for(int j=0;j<nb_mots;j++) {
			System.out.println(Dict[j].getMot()+" : "+Dict[j].getDef());
		}
		
		
	}
	int Nombre_sysnonyme(Mot_dict m) {
		int x=0;
		for(int j=0;j<nb_mots;j++) {
			if (Dict[j].synonyme(m.getMot())) {
				x++;
				
			}
		}
	   
		
		return x;
				
		
	}

}
