package Factory;

enum tipoForma {
    Quadrato, Rettangolo,
    Cerchio
}

public class Main {
    public static void main(String[] args) {

        for (tipoForma tipo : tipoForma.values()) {
            Shape forma = ShapeFactory.creaForma(tipo);
            System.out.print(tipo + ": ");
            forma.draw();
        }

    }
}