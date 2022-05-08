public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int bonus1 = service.calculate(10_000);
        System.out.println(bonus1 + " миль");

        int bonus2 = service.calculate(5_000);
        System.out.println(bonus2 + " миль");


    }
}