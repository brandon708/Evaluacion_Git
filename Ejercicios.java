public class Ejercicios {
   import java.util.Scanner;
    public class Main {
        public static void main(String[] args) throws Exception {
            System.out.println("--------Pregunta 1--------------");
            int k = 125;
            int y = 5;
            int resultadopregunta1 = k / y;
            System.out.println("La division es    :"+resultadopregunta1);


            System.out.println("--------Pregunta 2--------------");
            int z = 125;
            int x = 5;
            int resultadopregunta2 = z *x;
            System.out.println("La division es    :"+resultadopregunta2);

            System.out.println("--------Pregunta 3--------------");
            String bienvenida = "Kevin";
            System.out.println(bienvenida);

            System.out.println("Adios " + bienvenida);

            System.out.println("--------Pregunta 4--------------");
            Boolean variable1 = false;
            Boolean variable2 = true;
            System.out.println(variable1);
            System.out.println(variable2);

            System.out.println("--------Pregunta 5--------------");
            int numero = 35;
            int multiplicador = 5;
            int resultado = numero * multiplicador;
            System.out.println("Resultado es :  "+resultado);

            System.out.println("--------Pregunta 6--------------");
            int numero1 = 1;
            int numero2 = 2;
            int numero3 = 3;
            System.out.println(numero1 + " " +  numero2 + " " + numero3);
            System.out.println("--------Pregunta 7--------------");
            double num = 50.65;
            double num2 = 90.20;
            double respuesta = num+num2 ;
            System.out.println(respuesta);

            System.out.println("--------Pregunta 8--------------");
            double number = 30.20;
            double number2 = 90.30;
            double rpta = number*number2 ;
            System.out.println(rpta);

            System.out.println("--------Pregunta 9--------------");
            int n1 = 25 ;
            int n2 = 15;
            if(n1<n2) {
                System.out.println(n1);
            }else {
                System.out.println(n2);
            }


            System.out.println("--------Pregunta 10--------------");
            Scanner entradaEscaner = new Scanner (System.in);
            int nota1= entradaEscaner.nextInt();
            if(nota1>=11) {
                System.out.println("Aprobado");
            }else {
                System.out.println("Desaprobado");

            }
        }
    }

}
