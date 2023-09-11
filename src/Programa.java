import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Programa{

    public static void texto(Tigre eltigrede, String titulo){
        System.out.println("\n------------------------------------------------------------------------------------");
        if ("Borges".equals(titulo)){
            System.out.println("                El oro de los tigres by Jorge Luis Borges ");
        }
        else if ("Aleatorio".equals(titulo)){
            Random r = new Random();
            String[] minerales = {"Hierro","Cobre","Aluminio","Estaño","Titanio","Níquel","Cromo","Zinc"};
            System.out.println("                  El \u001B[34m"+minerales[r.nextInt(minerales.length)]+"\u001B[0m de los tigres by Randomize ****************");;
        }

        System.out.println("\nIba y venia,\u001B[34m"+eltigrede.getComportamiento()+"\u001B[0m y \u001B[34m"+eltigrede.getPeligrosidad()+
        "\u001B[0m cargado de \u001B[34m" +eltigrede.getVitalidad() +" \u001B[0menergia, del otro lado de los \nfirmes barrotes y todos lo mirabamos."+
        "Era el tigre de esa manana, en \nPalermo, y el tigre del Oriente y el tigre de Blake y de Hugo y Shere Khan, y\n"+
        "los tigres que fueron y que seran y asi mismo el tigre arquetipo, ya que el\nindividuo, en su caso, es toda la especie."+
        "Pensamos que era \u001B[34m"+eltigrede.getInstinto()+" \u001B[0m y \n\u001B[34m"+ eltigrede.getApariencia()+".\u001B[0m Norah, una nina, dijo: Esta hecho para el amor.");
        System.out.println("\n------------------------------------------------------------------------------------");
    }

    public static String elejirCaracteristica(String[] diccio,String nAtributo){  //recive el diccionario y el nombre del atributo
        
        System.out.println("\nQue \u001B[34m"+nAtributo+"\u001B[0m tendra su tigre?");
        int opcion=0;
        boolean correcto = false;
        String eleccion;
        Scanner sc = new Scanner (System.in);
        for (int i = 0 ;i<diccio.length;i++){
            System.out.printf("%d)%-13s ",i+1,diccio[i]);
        }
        while (!correcto){
            System.out.print("\nop:");
            try{
                opcion = sc.nextInt();
                if (opcion<0 || opcion > diccio.length){
                    System.out.print("Elija una opcion valida\n");
                }
                else{
                    correcto = true;
                }
            }catch(InputMismatchException ex){
                System.out.println("Elija una opcion valida\n");
                sc.nextLine();
            }
            
        }
        eleccion = diccio[opcion-1];
        return eleccion;
    }

    public static Tigre creaTigrePersonalizado(){
        Tigre tigrePersonalizado;
        tigrePersonalizado = new Tigre();

        System.out.println("--- Creacion de Tigre Personalizado ---");
        
        String[][] valoresAtributos = {{"delicado","brutal","sutil","fino","suave"},
                                {"fatal","manso","inofensivo","carinioso","peligroso"},
                                {"sanguinario","sagaz","cruel","comprensivo","piadoso"},
                                {"Hermoso","feo","viejo","jovial"},
                                {"Infinita","nula","menguante","inestable","creciente","escasa"}                
                };
        String[] nomAtributos = {"Comportamiento","Peligrosidad","Instinto","Apariencia","Vitalidad"};

        for (int i=0; i < nomAtributos.length;i++){
            String[] diAtributos = valoresAtributos[i];
            String nombreDelAtributo = nomAtributos[i];
            String eleccion = elejirCaracteristica(diAtributos,nombreDelAtributo);

            if (nombreDelAtributo.equals("Comportamiento")) {
                tigrePersonalizado.setComportamiento(eleccion);

            } 
            else if (nombreDelAtributo.equals("Peligrosidad")) {
                tigrePersonalizado.setPeligrosidad(eleccion);
                
            } 
            else if (nombreDelAtributo.equals("Instinto")) {
                tigrePersonalizado.setInstinto(eleccion);
                
            }
            else if (nombreDelAtributo.equals("Apariencia")){
                tigrePersonalizado.setApariencia(eleccion);
                
            }
            else if (nombreDelAtributo.equals("Vitalidad")){
                tigrePersonalizado.setVitalidad(eleccion);
                
            }
        }
        return tigrePersonalizado;
    }

    public static Tigre crearTigrePalermo(){
        Tigre tigrePalermo;
        tigrePalermo = new Tigre("delicado", "fatal", "sanguinario", "hermoso", "infinita");
        return tigrePalermo;
    }

    public static Tigre crearTigreAleatorio(){
        Tigre tigrealeatorio;

        String[] diCompo = {"delicado","brutal","sutil","fino","suave"};
        String[] diPeli = {"fatal","manso","inofensivo","carinioso","peligroso"};
        String[] diInsti = {"sanguinario","sagaz","cruel","comprensivo","piadoso"};
        String[] diApa = {"Hermoso","feo","viejo","jovial"};
        String[] diVita = {"Infinita","nula","menguante","inestable","creciente","escasa"};
        
        Random r = new Random();
        tigrealeatorio = new Tigre(diCompo[r.nextInt(diCompo.length)], diPeli[r.nextInt(diPeli.length)], diInsti[r.nextInt(diInsti.length)], diApa[r.nextInt(diApa.length)], diVita[r.nextInt(diVita.length)]);
        
        return tigrealeatorio;
    }

    public static Tigre crearTigreChubut(){
        Tigre tigreChubut;

        tigreChubut = new Tigre("bruto", "manso", "sagaz", "feo", "nula");
        return tigreChubut;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean terminar = false;
        System.out.println("Bienvenido a crear tu propia instancia del Tigre\n");
        
        while (terminar == false){
            System.out.println("1)Personalizar un Tigre e imprimir\n2)Imprimir el Tigre de Borges\n3)Imprimir un Tigre aleatorio\n4)Salir");
            try {
                System.out.print("op:");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1:
                        Tigre TigrePersonalizado = creaTigrePersonalizado();
                        texto(TigrePersonalizado,"Personalizado");
                        break;
                    case 2:
                        Tigre tigrePalermo = crearTigrePalermo();
                        texto(tigrePalermo,"Borges");
                        break;
                    case 3:
                        Tigre tigrealeatorio = crearTigreAleatorio();
                        texto(tigrealeatorio,"Aleatorio");
                        break;
                    case 4:
                        System.out.println("Saliendo");
                        terminar = true;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                    }
            } catch(Exception ex){
                System.out.println("Ingrese una opcion valida");
                sc.nextLine();
            }
        }
        

    }
}
