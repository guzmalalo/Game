public class Paladin extends Guerrier {
    private int mana;



    public Paladin(String nom, int pv, int force, int mana){
        super(nom, pv, force);
        this.mana = mana;
    }


    @Override
    public String toString(){
        return  presentation() + "Je suis un paladin";
    }

}
