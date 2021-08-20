public class Main {
    public static void main(String[] args) {


        BmiService bodyMassIndex = new BmiService();

        int weight = 80;
        float height = 1.9f;

        float bmi = bodyMassIndex.calculate(weight, height);
        System.out.println("Индекс массы тела = " + bmi);



    }
}
