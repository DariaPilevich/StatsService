import ru.netology.stats.services.StatsService;

public class main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] salesArr = {2,3,9,4,5,6,7};
        long sumSales = service.calcSum(salesArr);
        double avarage = service.calcAverage(salesArr);
        int maxSale = service.maxSaleMonth(salesArr);
        System.out.println(avarage);
        int monthUnderAvr = service.monthUnderAvr(salesArr);
        System.out.println(monthUnderAvr);
        int monthOverAvr = service.monthOverAvr(salesArr);
        System.out.println(monthOverAvr);
    }
}
