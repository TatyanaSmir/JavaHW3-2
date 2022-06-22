public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 80;// в килограммах
        double height = 1.8; // в метрах
        int imt = service.calculate(weight, height);
        System.out.println("ИМТ = " + imt);

    }

}
