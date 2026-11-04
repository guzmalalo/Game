public class ArmeCaC extends Arme{
    private int cadence;

    public ArmeCaC(String nom, int degats){
        this(nom, degats, 100, 1, 1);
    }

    public ArmeCaC(String nom, int degats, int durabilite, int niveau, int cadence){
        super(nom, degats, durabilite, niveau);
        this.cadence = cadence;
    }

    @Override
    public String toString(){
        return super.toString() + "- arme corps à corps";
    }

}
