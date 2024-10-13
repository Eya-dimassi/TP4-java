package ex9;

public class main {
	public static void main(String[] args) {
        Dictionnaire dict = new Dictionnaire(6, "MonDict1");

        Mot_dict mot1 = new Mot_dict();
        mot1.setMot("story");
        mot1.setDef("A narrative or account of events");

        Mot_dict mot2 = new Mot_dict();
        mot2.setMot("treasure");
        mot2.setDef("A collection of valuable items");

        Mot_dict mot3 = new Mot_dict();
        mot3.setMot("boat");
        mot3.setDef("A small vessel used for traveling on water");

        Mot_dict mot4 = new Mot_dict();
        mot4.setMot("shop");
        mot4.setDef("A place where goods or services are sold to customers");

        dict.Ajouter_Mot(mot1);
        dict.Ajouter_Mot(mot2);
        dict.Ajouter_Mot(mot3);
        dict.Ajouter_Mot(mot4);

        System.out.println("Liste avant le tri :");
        dict.Lister_dicho();

        dict.Trier();

        System.out.println("\nListe après le tri :");
        dict.Lister_dicho();

        String recherche = "boat";
        System.out.println("\nRecherche de la définition pour '" + recherche + "' :");
        System.out.println(dict.Recherche_dicho(recherche));

        System.out.println("\nSuppression du mot 'shop' :");
        dict.Supprimer_Mot(mot4);
        dict.Lister_dicho();


        System.out.println("\nNombre de synonymes pour treasure : " + dict.Nombre_sysnonyme(mot2));

        System.out.println("\n'treasure' et 'treasure' sont-ils des synonymes ? " + mot2.synonyme("treasure"));

        System.out.println("\n'treasure' et 'story' sont-ils des synonymes ? " + mot1.synonyme("chien"));
    }
}

