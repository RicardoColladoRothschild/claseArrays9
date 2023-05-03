public class CicleWhile {
    public static void main(String[] args){

        boolean mayorEdad = true;
        boolean bandera = true;
        //&& - > condicion 1 y condicon 2 deben ser true
        // || - > una de las dos condiciones debe ser true
        //! -> se intercambia, si es true sera false, y si es false, sera true
        while(bandera){
            System.out.println("SE MOSTRARA ESTO?");
            bandera = false;
        }
        int i;
        do{
            System.out.println("Ejecutando DO..WHILE();");
            bandera = false;
            i++;
        }while(bandera);
    }
}
