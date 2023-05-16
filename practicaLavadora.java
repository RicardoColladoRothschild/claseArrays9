import java.util.Scanner;

public class practicaLavadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String opcion = "";

            boolean lavadoraLlena = false;
            boolean salir = false;

            System.out.println("Bienvenido al sistema de lavado");

            while (!(opcion.equalsIgnoreCase("exit") || esNumero(opcion) || salir)) {
                System.out.println("1) Llenar lavadora de agua");
                System.out.println("2) Lavar");
                System.out.println("3) Secar");
                System.out.println("4) Secado rapido");
                System.out.println("5) Vaciar lavadora");
                System.out.println("6) Salir del sistema de lavado");

                opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        if (lavadoraLlena) {
                            System.out.println("La lavadora ya esta llena de agua.");
                        } else {
                            System.out.println("Llenando lavadora de agua...");
                            lavadoraLlena = true;
                        }
                        break;
                    case "2":
                        if (lavadoraLlena) {
                            System.out.println("Lavando...");
                        } else {
                            System.out.println("La lavadora no esta llena de agua. Por favor, llenala primero.");
                        }
                        break;
                    case "3":
                        System.out.println("Secando...");
                        break;
                    case "4":
                        System.out.println("Secado rapido...");
                        break;
                    case "5":
                        if (lavadoraLlena) {
                            System.out.println("Vaciando lavadora...");
                            lavadoraLlena = false;
                        } else {
                            System.out.println("La lavadora ya está vacia.");
                        }
                        break;
                    case "6":
                        System.out.println("Saliendo del sistema de lavado...");
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción invalida. Por favor, ingrese un numero valido para continuar el ciclo de lavado.");
                        break;
                }
            }

            if (salir) {
                System.out.println("Para salir del sistema, escriba 'exit'.");
                while (!opcion.equalsIgnoreCase("exit")) {
                    opcion = scanner.nextLine();
                }
            }
        }
        System.out.println("Saliendo del programa...");
    }

    public static boolean esNumero(String opcion) {
        try {
            Integer.parseInt(opcion);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
