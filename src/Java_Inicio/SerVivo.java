package Java_Inicio;

public abstract class SerVivo {

    protected int idade;

    public abstract void respirar();

    public SerVivo (int idade){
        this.idade = idade;

    }

    // public abstract void respirar();

    public void dormir(){
        System.out.print("Dormindo......");
    }
}
