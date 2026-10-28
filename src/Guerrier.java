public class Guerrier extends Personnage{
    private int force;

    public Guerrier(String nom){
        this(nom, 100);
    }

    public Guerrier(String nom, int force){
        super(nom, 50);
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
