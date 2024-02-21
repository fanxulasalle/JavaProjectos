/*public class Main {
    public static void main(String[] args) {
        double d = 858.483;

        String s = String.valueOf(d);

        int dot = s.indexOf('.');

        System.out.println(dot+" digits before decimal point");

        System.out.println((s.length()-dot-1)+" digits after decimal point");
    }
}*/
/*El siguiente código usa distintos métodos de la clase String. Ejecútalo e indica cual es la salida por
consola.

3 digits before decimal point
3 digits after decimal point

¿Qué métodos de la clase String se utilizan?
Se utilizan los metodos .valueOf(d) y indexOf()


¿Son estáticos o de instancia?
estaticos
El estatic no necessita un estancia
El metode instancia necessita cridar una variable i has de tancar la instancia

¿Qué función tiene cada uno de estos métodos?
valuOf(d) = transforma el valor de los numeros en string
indexOf('.') = le indica que en el siguiente string busca este caracter

¿Qué devuelven?

¿Qué parámetros de entrada tienen?
la variable d y s
*/
/*
public class Main {
    public static void main(String[] args) {
        String path = "home/user/index.html";
        int dot = path.lastIndexOf(".");
        int sep = path.lastIndexOf("/");

        String extension = path.substring(dot + 1);
        System.out.println("Extensión: " + extension);

        String extension2 = path.substring(sep + 1, dot);
        System.out.println("Extensión: " + extension2);
    }
}
*/
/*Ejercicio3*/
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un texto");
        String texto = sc.nextLine();

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
    }
}*/
/*Ejercicio4*/
// conceptos importantes: isEmpty, contains
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix una cadena de textos");
        String palabra = sc.nextLine();

        while (!palabra.isEmpty()) {
            System.out.print("Introduce una palabra para buscar: ");
            String Buscar = sc.nextLine();
            if (palabra.contains(Buscar)) {
                System.out.println("La palabra '" + Buscar + "' ha sido encontrada en el texto.");
            } else {
                System.out.println("La palabra '" + Buscar + "' no ha sido encontrada en el texto.");
            }
        }
         sc.close();
    }
}*/
//Ex5
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del
                universo", “Mi universo”, " Patria", " De mayor quiero ser feliz", " Empieza por los zapatos"};
                //Insert code here
        }
    }
}
