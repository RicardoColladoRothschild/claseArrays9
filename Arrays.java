public class Arrays{
    public static void main(String[] args){
        String[] nombres = {"ricardo","felixon","josefina","mario","pedro"};
        int capitan = 0;
        String[] nombres2 = {"ricardo","felixon","josefina","mario","pedro", "jake"};
        String[] nombresFiesta;
        nombresFiesta = new String[10];
        nombresFiesta[capitan] = "ricardo";
        nombresFiesta[1] = "felixon";
        nombresFiesta[7] = "josefina";
        
        System.out.println(nombres[3]);
        System.out.println(nombresFiesta[capitan]);
        System.out.println(nombresFiesta[6]);
        nombresFiesta[capitan] = "Vladi";
        System.out.println(nombresFiesta[0]);
        System.out.println("****************");
        for(int indice = 0;indice <= 5;indice++){
                System.out.println(nombres[indice]);

        }


    }
}

/*Java debugger, Debugger for java*/

