public class Main {

    public static void main(String[] args) {

        Integer numeratore = 5;
        Integer denominatore = null;

        controllaNull(numeratore, denominatore);

    }

    public static void controllaNull(Integer numeratore, Integer denominatore) {

        try{
            System.out.println(numeratore / denominatore);

        } catch (NullPointerException e) {
            System.out.println("uno dei 2 valori è null!");
        }


    }

}