public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double imt = service.calculate(80, 1.75);
        String result = String.format("%.2f", imt);
        System.out.print("ИМТ = " + result);

    }

}
