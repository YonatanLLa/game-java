import javax.xml.transform.Source;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*Decalraciones y asignacion*/
        String palabraSecreta = "inteligencia";
        int intentosMaximo = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Areglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        /*Estructura de control: iterativa*/

        while (!palabraAdivinada && intentos < intentosMaximo) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + "letras)");
            System.out.println("Introduce una letra, por favor: ");
            char letteer = scanner.next().charAt(0);
            System.out.println(letteer + "lettter");
            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letteer) {
                    letrasAdivinadas[i] = letteer;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! te quedan " + (intentosMaximo - intentos) + " Intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Palabra adivinada: " + palabraAdivinada);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("GAME OVER");
        }

        scanner.close();


    }
}