import java.util.List;
import java.util.stream.Collectors;

public class SalesAnalysis {
    public static void main(String[] args) {
        List<SalesRecord> salesRecords = new ArrayList<>();
        // add sample sales records

        filterSalesRecords(salesRecords, "North");
        mapAndTransformData(salesRecords, "North");
        calculateTotalSales(salesRecords, "North");
        groupSalesBySalesPerson(salesRecords);
        generateSalesReport(salesRecords);
    }

    public static void filterSalesRecords(List<SalesRecord> salesRecords, String region) {
        salesRecords.stream()
                .filter(record -> record.getRegion().equals(region))
                .forEach(System.out::println);
    }

    public static void mapAndTransformData(List<SalesRecord> salesRecords, String region) {
        salesRecords.stream()
                .filter(record -> record.getRegion().equals(region))
                .map(record -> record.getAmount())
                .forEach(System.out::println);
    }

    public static void calculateTotalSales(List<SalesRecord> salesRecords, String region) {
        double totalSales = salesRecords.stream()
                .filter(record -> record.getRegion().equals(region))
                .mapToDouble(record -> record.getAmount())
                .sum();
        System.out.println("Total sales: " + totalSales);
    }

    public static void groupSalesBySalesPerson(List<SalesRecord> salesRecords) {
        salesRecords.stream()
                .collect(Collectors.groupingBy(record -> record.getSalesPerson()))
                .forEach((salesPerson, records) -> System.out.println("Sales person: " + salesPerson + ", Records: " + records));
    }

    public static void generateSalesReport(List<SalesRecord> salesRecords) {
        salesRecords.stream()
                .collect(Collectors.groupingBy(record -> record.getSalesPerson(),
                        Collectors.summingDouble(record -> record.getAmount())))
                .forEach((salesPerson, totalSales) -> System.out.println("Sales person: " + salesPerson + ", Total sales: " + totalSales));
    }
}
