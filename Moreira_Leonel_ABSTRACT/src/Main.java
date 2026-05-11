public class Main {
    public static void main(String[] args) {

        Figura[] figuras = new Figura[] {
                new Circulo("Rojo", true, 5),
                new Circulo("Azul", false, 3),
                new Rectangulo("Verde", true, 4, 6),
                new Rectangulo("Amarillo", false, 2, 8),
                new TrianguloRectangulo("Negro", true, 3, 4),
                new TrianguloRectangulo("Blanco", false, 5, 12)
        };

        for (Figura f : figuras) {
            f.describir();
        }
    }
}