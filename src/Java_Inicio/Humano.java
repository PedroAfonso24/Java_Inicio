package Java_Inicio;

public class Humano extends SerVivo{
    public String nome;

    public Humano(){
        super(42);
        this.nome = "Afonso";
    }

   //  @Override
    public void respirar() {
        System.out.println("Transformando em oxigenio");
    }
}
