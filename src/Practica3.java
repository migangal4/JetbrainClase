import java.util.Scanner;


public class Practica3 {

    public static void main(String[] args) throws Exception {
        //Iniciamos el Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el tipo de ejercicio a resolver:");
        String a = sc.nextLine();
        switch(a){
            case "if":
                    Ejercicios.ejercicioif();
                    break;
            case "for":
                    break;
            default:
                throw new IllegalStateException("Operacioin incorrecta");


        }

    }

}

class Ejercicios{
    static void ejercicioif(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el ejercicio a resolver:");
        int a = sc.nextInt();
        switch(a){
            case 1:
                Ejercicios.ejercicio1();
                break;
            case 2:
                Ejercicios.ejercicio1();
                break;
            case 5:
                Ejercicios.ejercicio1();
                break;
            case 6:
                Ejercicios.ejercicio1();
                break;
            case 7:
                Ejercicios.ejercicio1();
                break;
            default:
                try {
                    throw new Exception("Ejercicio inexistente");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }

    }
    static void ejerciciofor(){

    }
    static void ejercicio1(){
        System.out.println("Ejercicio 1: ");

    }
    static void ejercicio2(){
        System.out.println("Ejercicio 2: ");

    }
    static void ejercicio5(){
        System.out.println("Ejercicio 5: ");

    }
    static void ejercicio6(){
        System.out.println("Ejercicio 1: ");

    }
    static void ejercicio7(){
        System.out.println("Ejercicio 1: ");

    }
    static void ejerciciof2(){
        System.out.println("Ejercicio 1: ");

    }
}
