package Java_Inicio;

// public -> Acessível de todo lugar
// default -> Quando eu não defino, ele segue esse daqui
// private -> Acessível somente dentro da classe que foi definido
// protected -> Acessível por todo mundo que está no mesmo pacote

public class Main {

        public static void main(String[] args) {
            Carro meuCarro = new Sandero();
            Carro meuCarro2 = new Mobi();

            Humano meuSer = new Humano();
            meuSer.respirar();

            Carro meuErroFurado = null;

            NullPointerException
                    ArrayOutOfBoundEx

            try {
                meuErroFurado.acelerar();
            } catch (NullPointerException exception){
                System.out.println("Vende carro furado");
            }



        }
}

