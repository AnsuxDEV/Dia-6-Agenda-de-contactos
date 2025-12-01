import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private static ArrayList<Contacto> contactos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = false;

        while (true) {
            System.out.println("--- AGENDA DE CONTACTOS ---");
            System.out.println("1 - Añadir contacto");
            System.out.println("2 - Mostrar contactos");
            System.out.println("3 - Buscar contacto");
            System.out.println("4 - Eliminar contacto");
            System.out.println("5 - Salir");

            int opcion = teclado.nextInt();
            teclado.nextLine(); // Un salto de línea que puede usarse como "pausa".

            switch (opcion) {
                case 1:
                    añadirContacto(teclado);
                    break;
                
                case 2:
                    mostrarContactos();
                    break;

                case 3: 
                    buscarContacto(teclado);
                    break;

                case 4:
                    eliminarContacto(teclado);
                    break;

                case 5:
                    continuar = false;
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 5.");
                    break;
            }
            if (continuar) {
                System.out.println("Pulsa Enter para continuar...");
                teclado.nextLine();
            }
        }
    }

    // Metodos principales

    public static void añadirContacto(Scanner teclado) {
        System.out.println("Introduce el nombre del nuevo contacto: ");
        String nombre = teclado.nextLine();

        System.out.println("Introduce el telefono del nuevo contacto: ");
        String telefono = teclado.nextLine();

        System.out.println("Introduce el email del nuevo contacto: ");
        String email = teclado.nextLine();

        Contacto nuevo =  new Contacto(nombre, telefono, email);
        contactos.add(nuevo);
        System.out.println("Contacto " + "'" + nombre + "'" + " añadido correctamente.");
    }

    public static void mostrarContactos() {
        if (contactos.isEmpty()){
            System.out.println("No hay contactos en su agenda.");
        } else {
            for (Contacto c : contactos) {
                System.out.println("-----------------------");
                System.out.println(c);
            }
        }
    }

    public static void buscarContacto(Scanner teclado) {
        System.out.println("Introduce el nombre a buscar: ");
        String busqueda = teclado.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(busqueda)) {
                System.out.println("Contacto encontrado:");
                System.out.println(c);
                return;
            }
        }
        System.out.println("No se encuentra el contacto con el nombre " + "'" + busqueda + "'");
    }

    public static void eliminarContacto(Scanner teclado) {
        System.out.println("Introduce el nombre del contacto a eliminar: ");
        String eliminado = teclado.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(eliminado)) {
                contactos.remove(c);
                System.out.println("Contacto " + "'" + eliminado + "'" + " eliminado correctamente.");
                return;
            }
        }
        System.out.println("No se encuentra el contacto con el nombre " + "'" + eliminado + "'");
    }
}