import java.util.Scanner;
import java.lang.Math;

public class Practica1 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce los segundos:");
            int s1 = sc.nextInt();
            System.out.println("Introduce los minutos:");
            int m1 = sc.nextInt();
            System.out.println("Introduce las horas:");
            int h1 = sc.nextInt();
            System.out.println("Introduce los segundos de la hora final:");
            int s2 = sc.nextInt();
            System.out.println("Introduce los minutos de la hora final:");
            int m2 = sc.nextInt();
            System.out.println("Introduce las horas de la hora final:");
            int h2 = sc.nextInt();
            int sf = (Math.abs(s1 - s2))%60;
            int mf = (Math.abs(m1 - m2))%60;
            int hf = (Math.abs(h1 - h2))%24;
            System.out.println("Han pasado: " + hf + ":" + mf + ":" + sf + " horas.");
        }
    }



