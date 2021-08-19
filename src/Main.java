public class Main {
    public static void main(String[] args) {


        BmiService bodyMassIndex = new BmiService();

        int weight = 80;
        float height = 1.9f;

        float bmi = bodyMassIndex.calculate(weight, height);
        int bmitotal = (int) bmi;
        System.out.println("Индекс массы тела = " + bmitotal);



    }
}
