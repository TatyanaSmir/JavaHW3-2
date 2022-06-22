public class BmiService {


    public double calculate(double weight, double height) {

        double height2 = height * height;
        double imt = weight / height2;

        return imt;

    }

}
