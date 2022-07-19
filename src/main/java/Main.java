public class Main {

    public static void main (String[] args) {
        BonusService service = new BonusService();

        long a = 300;
        long b = service.calculate(10000,true);
        System.out.println(a + " = " + b);

        long c = 150;
        long d = service.calculate(15000,false);
        System.out.println(c + " = " + d);
    }
}
