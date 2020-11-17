import java.util.Scanner;


public class Practica3 {

    public static void main(String[] args) {
        //Iniciamos el Scanner

        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el tipo de ejercicio a resolver:");
        String a = sc.nextLine();
        switch(a){
            case "if":
                    Ejercicios.ejercicio1();
            case "If":




        }

        }
        System.out.println("Introduce un numero:");// Pedimos al usuario que introduzca un numero
        String a = sc.nextLine();
        System.out.println("Introduce otro numero:");
        int b = sc.nextInt();


        // Comprobamos que los numeros son positivos

        if ((a < 0)||(b<0)) {

            System.out.println("Uno de los numeros es negativo");

        }else{

            System.out.println("Introduce la operacion:");
            String sim = sc.next();

            // Comprobamos la operacion
            switch (sim) {
                case "*":
                    System.out.println( "El resultado es: " + (a * b));
                    break;
                case "/": //Aqui nos puede dar un error si b es 0
                    if (b == 0){
                        System.out.println("No puedes dividir por 0");
                    }else{
                        System.out.println("El resultado es: " + (a / b));
                    }
                    break;
                case "+":
                    System.out.println("El resultado es: " + (a + b));
                    break;
                case "-":
                    System.out.println("El resultado es: " + (a - b));
                    break;
                default:
                    //Lanzamos un error de que esa operacion no existe
                    throw new IllegalStateException("Operacioin incorrecta");
            }
        }
    }
class Ejercicios{
    static void ejercicio1(){

    }
    static void ejercicio2(){

    }
}
