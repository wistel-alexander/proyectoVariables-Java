public class funciones {
    public static void main(String[] args) {
        String arturInformation = builPersonInformation("arturo", 30);
        String wistelInformation = builPersonInformation("wistel", 31);
        String audiInformation = buildInformationCars("tornado", 123546, "rojo");
        String mazdaInformation = buildInformationCars("swin", 15986,"azul");
        System.out.println(wistelInformation);
        System.out.println(arturInformation);
        System.out.println(audiInformation);
        System.out.println(mazdaInformation);

    }


    public static String builPersonInformation(String personName, int personAge) {
        return "hola mi nombre es: " + personName + " y tengo " + personAge + " de edad.";
    }


    public static String buildInformationCars(String nameCar, int serieMotor, String colorCarro) {
        return "esta es la informacion del carro : "
                + " nombre del carro: " + nameCar
                + " , numero del motor: " + serieMotor
                + " , color carro: " + colorCarro;
    }
}





