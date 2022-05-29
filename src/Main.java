public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной миллиB
        int priceTicket = 1_000;

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        int summBonusMiles = service.calculate(priceTicket);
        System.out.println("При покупке билета за " + priceTicket + " рублей Вы получаете " + summBonusMiles + " миль(ю)");
    }
}
