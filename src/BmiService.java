public class BmiService {

    public float calculate(int weight, float height) {

        float total = weight / (height * height);

        return total;
    }

}
