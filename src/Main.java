public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 80;// в килограммах
        double height = 1.75; // в метрах
        double imt = service.calculate(weight, height);
        String result = String.format("%.2f", imt);
        System.out.print("ИМТ = " + result);

    }

}
