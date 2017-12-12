package Army;

public class Vehicles {
    private String type;
    private int damageValue;

    public Vehicles(String type, int damageValue){
        this.type = type;
        this.damageValue = damageValue;
    }

    public String getType(){
        return this.type;
    }

    public int getDamageValue(){
        return this.damageValue;
    }

    public void receiveDamage(int inputDamage) {
        this.damageValue = this.damageValue - inputDamage;
    }
}
