class Carro {
    private final String marca;
    private final String modelo;
    private final int ano;
    private boolean ligado;
    private int velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
        this.velocidade = 0;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidade = 0;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar(int aumentoVelocidade) {
        if (ligado) {
            velocidade += aumentoVelocidade;
            System.out.println("Vrum vrum! O carro está acelerando. Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Não é possível acelerar, o carro está desligado.");
        }
    }

    public void frear(int reducaoVelocidade) {
        if (ligado) {
            if (velocidade - reducaoVelocidade >= 0) {
                velocidade -= reducaoVelocidade;
                System.out.println("O carro está reduzindo a velocidade. Velocidade: " + velocidade + " km/h");
            } else {
                velocidade = 0;
                System.out.println("O carro parou.");
            }
        } else {
            System.out.println("O carro já está parado, não é possível frear.");
        }
    }

    public void status() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
        if (ligado) {
            System.out.println("O carro está ligado e a uma velocidade de " + velocidade + " km/h.");
        } else {
            System.out.println("O carro está desligado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Volkswagen", "Gol", 2020);

        meuCarro.ligar();
        meuCarro.acelerar(30);
        meuCarro.frear(10);
        meuCarro.status();
        meuCarro.desligar();
    }
}
