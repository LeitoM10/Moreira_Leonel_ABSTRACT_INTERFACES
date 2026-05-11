public class Main {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[] {
                new EmpleadoPorHora("Juan", 1, 40, 5),
                new EmpleadoPorHora("Ana", 2, 35, 6),

                new EmpleadoFijo("Carlos", 3, 40, 500),
                new EmpleadoFijo("Maria", 4, 40, 600),

                new EmpleadoComision("Luis", 5, 40, 300, 10, 2000),
                new EmpleadoComision("Sofia", 6, 40, 350, 8, 1500)
        };

        for (Empleado e : empleados) {
            e.mostrarInfo();

            if (e instanceof Bonificable) {
                Bonificable b = (Bonificable) e;
                System.out.println("Bono: " + b.calcularBono());
            }

            System.out.println("-----------------------------");
        }
    }
}