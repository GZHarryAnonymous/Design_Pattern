package decorator_pattern;

public class Main {
    public static void main(String args[]) {
        BigTrouser trouser = new BigTrouser(null, null);
        TShirt shirt = new TShirt(null, null);
        Tom t = new Tom("Tom", CharacterType.extraverted);
        shirt.SetPerson(t);
        trouser.SetPerson(shirt);
        trouser.show();
        BigTrouser trouserNew = new BigTrouser(null, null);
        TShirt shirtNew = new TShirt(null, null);
        Harry h = new Harry("Harry", CharacterType.introverted);
        shirtNew.SetPerson(h);
        trouserNew.SetPerson(shirtNew);
        trouserNew.show();
    }

}
