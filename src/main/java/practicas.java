import java.util.Objects;
import java.util.Scanner;

public class practicas {
    public static void main(String[] args) {

// hacer algoritmo que calcule la edad de una persona y evalue si es apto para
        // prestar el servicio militar en colombia.

        String nacionalidadRequerida = "colombia";
        int edadRequerida = 18;

        Scanner sc = new Scanner(System.in);

        System.out.println(" ingresa tu edad: ");
        int edadPersona = sc.nextInt();


        if (edadPersona >= edadRequerida) {

        }
        else if (edadPersona < edadRequerida) {
                System.out.println(" usted no cumple con la edad requerida para el " +
                        "servicio militar");

            }



        System.out.println(" ingresa tu nacionalidad: ");

        String nacionalidadPersona = sc.next();

        if (Objects.equals(nacionalidadPersona, nacionalidadRequerida)) {
            System.out.println(" felicitaciones, puedes aplicar para el servicio militar " +
                    "en colombia");
        }

        else if (!Objects.equals(nacionalidadPersona, nacionalidadRequerida)) {

            System.out.println(" su nacionalidad no coincide con la nacionalidad " +
                    "requerida para prestar el servicio militar en colombia");
        }

    }
}
