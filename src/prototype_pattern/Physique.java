package prototype_pattern;

public class Physique implements Cloneable{
    private boolean health;
    
    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
