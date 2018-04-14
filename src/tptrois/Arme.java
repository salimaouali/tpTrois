 
package tptrois;



public class Arme {

private String nom;
private int dommage;

    public Arme(String nom, int dommage) {
        this.nom = nom;
        this.dommage = dommage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDommage() {
        return dommage;
    }

    public void setDommage(int dommage) {
        this.dommage = dommage;
    }



}
