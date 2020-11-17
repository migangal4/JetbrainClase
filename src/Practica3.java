import java.util.Scanner;


public class Practica3 {

    public static void main(String[] args) throws Exception {
        //Iniciamos el Scanner

        Scanner sc = new Scanner(System.in);


        System.out.println("Elija el tipo de ejercicio a resolver:");
        System.out.println("if ");
        System.out.println("switch ");

        // Entramos la seleccion y con el switch elegimos donde ir.
        String a = sc.nextLine();
        switch(a){
            case "if":
                    Ejercicios.ejercicioif();
                    break;
            case "switch":
                    Ejercicios.ejerciciofor();
                    break;
            default:
                throw new IllegalStateException("Opcion no valida");


        }

    }

}
// Una clase para los ejercicios

class Ejercicios{

    //Selector de los ejercicios If

    static void ejercicioif(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el ejercicio a resolver:");
        System.out.println("1. Par impar");
        System.out.println("2. Sueldo");
        System.out.println("5. Triangulo");
        System.out.println("6. Fiesta Marmotas");
        System.out.println("7. Notas");
        int a = sc.nextInt();

        // En cada caso llamamos a uno de los ejercicios

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

    //Selector de los ejercicios Switch

    static void ejerciciofor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija el ejercicio a resolver:");
        System.out.println("2. Lenguajes");
        System.out.println("3. Numeros");
        System.out.println("4. Casas Harry Potter");
        System.out.println("5. Movimiento");
        int a = sc.nextInt();
        switch(a){
            case 2:
                Ejercicios.ejerciciof2();
                break;
            case 3:
                Ejercicios.ejerciciof3();
                break;
            case 4:
                Ejercicios.ejerciciof4();
                break;
            case 5:
                Ejercicios.ejerciciof5();
                break;
            default:
                try {
                    throw new Exception("Ejercicio inexistente");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }

    // Aqui empiezan los ejercicios
    static void ejercicio1(){
        System.out.println("Ejercicio 1: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        int a = sc.nextInt();
        if (a % 2 == 0){
            System.out.println(a + " es par");
        }else{
            System.out.println(a + " es impar");
        }
    }
    static void ejercicio2(){
        System.out.println("Ejercicio 2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un su sueldo:");
        int a = sc.nextInt();
        if (a > 9000){
            System.out.println("Debe pagar impuestos");
        }else{
            System.out.println("No debe pagar impuestos");
        }
    }
    static void ejercicio5(){
        System.out.println("Ejercicio 5: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un los lados del triangulo:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a){
            System.out.println("Ese triangulo existe");
        }else{
            System.out.println("Ese triangulo no existe");
        }
    }
    static void ejercicio6(){
        System.out.println("Ejercicio 6: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de tazas:");
        int a = sc.nextInt();
        System.out.println("Introduzca 'si' en caso de ser fin de semana o 'no' en otro caso:");
        String b = sc.nextLine();
        if (b == "si"){
            if(a >= 15 && a <= 25){
                System.out.println("Fiesta exitosa");}else{
                System.out.println("Fiesta no exitosa");
            }
        }else if (b == "no"){
            if(a >= 10 && a <= 20){
                System.out.println("Fiesta exitosa");}else{
                System.out.println("Fiesta no exitosa");}
        }else{
            throw new IllegalStateException("No vale esa respuesta");
            }
        }


    static void ejercicio7(){
        System.out.println("Ejercicio 7: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un su nota:");
        int a = sc.nextInt();
        if (a <= 10 && a >= 9){
            System.out.println("Su nota es SB");
        }else if(a < 9 && a >= 7){
            System.out.println("Su nota es N");
        }else if(a < 7 && a >= 6){
            System.out.println("Su nota es B");
        }else if(a < 6 && a >= 5){
            System.out.println("Su nota es SUF");
        }else if(a < 5 && a >= 5){
            System.out.println("Su nota es INS");
        }else if(a < 3 && a >= 0){
            System.out.println("Su nota es MD");
        }else{
            System.out.println("Nota fuera del rango");
        }

    }
    static void ejerciciof2(){
        System.out.println("Ejercicio 2: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el numero de tu lenguaje de programacion: ");
        System.out.println("1. Java");
        System.out.println("2. Kotlin");
        System.out.println("3. Scala");
        System.out.println("4. Python");
        int a = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("SI");
                break;
            case 2:
                System.out.println("NO");
                break;
            case 3:
                System.out.println("NO");
                break;
            case 4:
                System.out.println("NO");
                break;
            default:
                throw new IllegalStateException("Numero incorrecto");
        }
    }
    static void ejerciciof3(){
        System.out.println("Ejercicio 3: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba un numero del uno al nueve con letras: ");

        String a = sc.nextLine();
        switch (a){
            case "uno":
                System.out.println("1");
                break;
            case "dos":
                System.out.println("2");
                break;
            case "tres":
                System.out.println("3");
                break;
            case "cuatro":
                System.out.println("4");
                break;
            default:
                throw new IllegalStateException("Numero incorrecto");
            case "cinco":
                System.out.println("5");
                break;
            case "seis":
                System.out.println("6");
                break;
            case "siete":
                System.out.println("7");
                break;
            case "ocho":
                System.out.println("8");
                break;
            case "nueve":
                System.out.println("9");
                break;

        }
    }
    static void ejerciciof4(){
        System.out.println("Ejercicio 4: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una casa de Harry Potter: ");

        String a = sc.nextLine();
        switch (a){
            case "gryffindor":
                System.out.println("Valentia");
                break;
            case "hufflepuff":
                System.out.println("Lealtad");
                break;
            case "slytherin":
                System.out.println("Astucia");
                break;
            case "ravenclaw":
                System.out.println("Intelecto");
                break;
            default:
                throw new IllegalStateException("No es una casa valida");
        }
    }
    static void ejerciciof5(){
        System.out.println("Ejercicio 5: ");
            Scanner sc = new Scanner(System.in);

            System.out.println("Escriba el numero para moverse: ");
            System.out.println("1 - Arriba ");
            System.out.println("2 - Abajo ");
            System.out.println("3 - Derecha ");
            System.out.println("4 - Izquierda ");
            int a = sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("Subir");
                    break;
                case 2:
                    System.out.println("Bajar");
                    break;
                case 3:
                    System.out.println("Mover a la izquierda");
                    break;
                case 4:
                    System.out.println("Mover a la derecha");
                    break;
                default:
                    throw new IllegalStateException("ERROR");

        }
    }
}
