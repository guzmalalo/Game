//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Mage gandalf = new Mage("Gandalf");
    Guerrier gimli = new Guerrier("Gimli");
    Paladin aragorn = new Paladin("Aragorn", 85, 100, 100);

    gandalf.soigner(aragorn);
    gandalf.soigner(aragorn);

    System.out.println("Points de vie de aragorn "+ aragorn.getPv());

    List<Arme> ListeArmes = new ArrayList<Arme>();

    ListeArmes.add(new ArmeCaC("Excalibur", 23));
    ListeArmes.add(new ArmeCaC("Joyeuse", 32));
    ListeArmes.add(new ArmeCaC("Machete", 11));

    //System.out.println(ListeArmes);

    // for each
    for (Arme a:ListeArmes ){
        System.out.println(a);
    }

    // for classique
    for (int i = 0; i < ListeArmes.size(); i++) {
        System.out.println(ListeArmes.get(i));
    }

    aragorn.setArme(ListeArmes.get(0));
    System.out.println(aragorn);


}
