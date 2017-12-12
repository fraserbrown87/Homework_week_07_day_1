package Kaijus;

public class Lizards extends Kaiju implements IRoar {

    public Lizards(String name, int healthValue, int attackValue){
        super(name, healthValue, attackValue);
    }

    public String roar(String string){
        return string;
    }

    public String attack(){
        return "Sonic BOOM";
    }
}
