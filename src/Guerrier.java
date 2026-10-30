public class Guerrier extends Personnage{
    protected int force;

    public Guerrier(String nom){
        this(nom,100,100);
    }

    public Guerrier(String nom, int pv, int force){
        super(nom, pv);
        this.force = force;
    }


    @Override
    public void attaque(Personnage cible) {
        super.attaque(cible);
        cible.prendreDegats(force*2);
        
    }

    @Override
    public String toString(){
        String message = super.toString() + " et je suis un Guerrier";
        return message;
    }


}
