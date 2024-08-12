import java.util.List;
import java.util.stream.Collectors;

public class SalesAnalysis {
    public static void main(String[] args) {
        List<SalesRecord> salesRecords = new ArrayList<>();
        // add sample sales records

        filterAndSortRecords(salesRecords, "Electronics");
        calculateAverageSales(salesRecords, "North");
        findTopSalesRecord(salesRecords);
        parallelStreamOperations(salesRecords);
    }

    public static void filterAndSortRecords(List<SalesRecord> salesRecords, String productCategory) {
        salesRecords.stream()
                .filter(record -> record.getProductCategory().equals(productCategory))
                .sorted((record1, record2) -> record1.getDate().compareTo(record2.getDate()))
                .forEach(System.out::println);
    }

    public static void calculateAverageSales(List<SalesRecord> salesRecords, String region) {
        double averageSales = salesRecords.stream()
                .filter(record -> record.getRegion().equals(region))
                .map
