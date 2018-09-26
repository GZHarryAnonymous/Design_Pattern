package prototype_pattern;

public class Body implements Cloneable{
    private double weight;
    private Physique physique;
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Physique getPhysique() {
        return physique;
    }
    public void setPhysique(Physique pyysique) {
        this.physique = pyysique;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        Body body =(Body) super.clone();
        body.physique = (Physique)physique.clone();//deep copy
        return body;
    }
}
