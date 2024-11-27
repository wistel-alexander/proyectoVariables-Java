public class bucles {
    public static void main(String[] args) {
//bucles for: 3 ejemplos (crear un bucle, multiplicar un numero por si mismo, mostrar
// por pantalla la lista de 3 personas en un array)
       /*
        for (int i = 0; i < 10; i++) {

            System.out.println("hola " + (i + 1));  */

     /*   int number = 5;
        for (int i = 0; i < 3; i++) {
            number = number + number;
            System.out.println("el resultado es: " + number);
           }*/

 /*       String[] names = {"arturo", "juan", "alex"};
        for (int i = 0; i < names.length; i++){
            System.out.println("los nmbres son: " + names[i] );
        } */

// bucles while para ejercicio de velocidad.
        double vehicleSpeed = 0.0;
        double speedLimit = 100.0;
        while (vehicleSpeed < speedLimit){
            vehicleSpeed += 12.5;
            System.out.println(" the vehicle speed is: " + vehicleSpeed + " k/h");

        }
    }
}


