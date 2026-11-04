public abstract class Arme{
    private final String nom;
    private int degats;
    private int durabilite;
    private int niveau;


    public Arme(String nom, int degats){
        this(nom, degats, 100, 1);
    }

    public Arme(String nom, int degats, int durabilite, int niveau){
        if (degats<0 || durabilite<0 || niveau <0){
            throw new IllegalArgumentException("un des paramtetres est negatif");
        }

        this.degats =degats;
        this.nom = nom;
        this.durabilite = durabilite;
        this.niveau = niveau;
    }

    public void setDegats(int degats){
        this.degats =  degats;
    }

    public int getDegats(){
        return degats;
    }

    public int getDurabilite() {
        return durabilite;
    }

    public void setDurabilite(int durabilite) {
        this.durabilite = durabilite;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }


    public String getNom() {
        return nom;
    }


    @Override
    public String toString(){
        return nom + "(Niv " + niveau + ")";
    }

}
