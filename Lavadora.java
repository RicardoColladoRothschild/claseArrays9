import java.util.Scanner;

public class Lavadora {
    public static void main(String[] args){
       Scanner lectura = new Scanner(System.in);
            int aguaLavadora, secador, lavadoraVacia, proceso;
            int letra;
        do {
            System.out.println("Ingrese el numero de la opcion a realizar: ");
            System.out.println("0) Llenar lavadora de agua");
            System.out.println("1) Lavar");
	        System.out.println("2) Secado Regular");
	        System.out.println("3) Secado Rapido");
	        System.out.println("4) Vaciar Lavadora");

            proceso = lectura.nextInt();

            switch (proceso) {
                case 0:
                    System.out.println("Ingrese el numero del proceso a seguir: ");
                        aguaLavadora = lectura.nextInt();
                    if (aguaLavadora == 0){
                        System.out.println("Llenado de lavadora inicializado. ");
                    }
                    else{
                        System.out.println("Lavadora falta de agua, ingrese el numero 0 para iniciar su proceso correctamente.");
                    }
                    break;
                
                case 1:
                    System.out.println("Ingrese el numero del proceso a seguir: ");
                        aguaLavadora = lectura.nextInt();
                    if (aguaLavadora >= 0){
                        System.out.println("lavado iniciado correctamente.");
                    }
                    else if(aguaLavadora != 2){
                        System.out.println("Dato invalido, ingrese el numero 1 para iniciar su proceso correctamente.");
                    }
                    else {
                        System.out.println("Dato invalido.");
                    }
                    break;
                
                case 2:
                    System.out.println("Ingrese el numero del proceso a seguir: ");
                     secador = lectura.nextInt();
                    if (secador == 2){
                        System.out.println("Secado de forma regular iniciado.");
                    }
                    else{
                        System.out.println("Numero de secado regular invalido, ingrese el numero 1 para iniciar su proceso correctamente.");
                    }
                    break;
                
                case 3:
                    System.out.println("Ingrese el numero del proceso a seguir: ");
                    secador = lectura.nextInt();
                    if ((secador != 2) && (secador == 3)){
                        System.out.println("Secado rapido iniciado.");
                    }
                    else{
                        System.out.println("Numero de secado rapido invalido, ingrese el numero 3 para iniciar su proceso correctamente.");
                    }
                    break;
                
                case 4:
                    System.out.println("Ingrese el numero del porceso a seguir.");
                    lavadoraVacia = lectura.nextInt();
                    if (!(lavadoraVacia != 4) || (lavadoraVacia == 4)){
                        System.out.println("vaciado de lavadora iniciado correctamente.");
                    }
                    else if(lavadoraVacia == 4){
                        System.out.println("vaciado de lavadora iniciado correctamente.");
                    }
                    else {
                        System.out.println("Numero para vaciado de lavadora incorrecto, ingrese el numero 4 para iniciar su vaciado correctamente.");
                    }
                    break;
                
                default:
                System.out.println("Opcion incorrecta");
                break;
                
            }
            System.out.println("Ingrese el numero 1 para continuar y el para finalizar el 2: ");
                 letra = lectura.nextInt();

        } while (letra == 1);
        System.out.println("Lavado finalizado");
    }
}
