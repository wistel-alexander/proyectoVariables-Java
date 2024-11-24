    public class estructurasDeControl {

        public static void main(String[] args) {


/*
        boolean isAdult = true;
        if (isAdult == false) {

            System.out.println(" el usuario es adulto");
        } else {
            System.out.println(" el usuario no es adulto");

}
// operadores logicos y matematicos//

    && - and -  ampersan - si dos cosas o tres son verdaderas da funciona, pero todas deben cumplir.
    || - or - determina si una de las cosas es verdadera, y deja seguir.
    ! - negacion - permite cambiar el valor de algo, invierte el valor booleano.
    == equals - permite comprobar si dos cosas son iguales.
    != no equals - comprueba si dos cosas no son iguales.
    < - menor que
    > - mayor que
    >= - mayor o igual que
    <= - menor o igual que

 */
            /*
            double salaryPerYear = 10000;
            int age = 35;
            boolean isVip = false;
            boolean hasDebts = false;

            if (salaryPerYear >= 100000 || isVip){
                System.out.println(" te damos el prestamo completo");
            } else if (salaryPerYear >= 50000 && age < 30){
                System.out.println(" te damos la mitad del prestamo");
            } else if (salaryPerYear >=30000 && age < 40 ) {
                System.out.println(" te damos un tercio del prestamo");
            } else if (! hasDebts) {
                System.out.println(" te damos el 10 % del prestamo");
            } else {
                System.out.println(" no cumples ninguno de los items, asi que no te damos el prestamo");
            }

        }
    } */

         String productType = "alcohol";
            switch (productType) {
                case "salud":
                    System.out.println(" el impuesto es 5 %");
                    break;
                case "belleza":
                    System.out.println(" el impuesto es 10%");
                    break;
                case "alcohol":
                    System.out.println(" el impuesto es 20%");
                    break;
                default:
                    System.out.println(" el tipo de producto  es conocido");
                    break;
            }


        }
    }