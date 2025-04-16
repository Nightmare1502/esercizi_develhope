package Factory;

public class ShapeFactory {

    public static Shape creaForma(tipoForma tipo) {
        switch (tipo) {
            case Quadrato:
                return new Quadrato();
            case Rettangolo:
                return new Rettangolo();
            case Cerchio:
                return new Cerchio();
            default:
                throw new IllegalArgumentException("Tipo di forma non supportato: " + tipo);
        }
    }
}
