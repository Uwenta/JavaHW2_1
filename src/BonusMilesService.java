public class BonusMilesService {
    public int calculate(int priceTicket) {
        int bonus = 20;
        int miles = priceTicket/bonus;
        return miles;
    }

}
