public class BmiService {


    public int calculate(int weight, double height) {

        double height2 = height * height;
        double imt = weight / height2;

        return (int) Math.round(imt);

    }

}
