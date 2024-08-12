public static void calculateAverageSales(List<SalesRecord> salesRecords, String region) {
    double averageSales = salesRecords.stream()
            .filter(record -> record.getRegion().equals(region))
            .mapToDouble(record -> record.getAmount())
            .average()
            .orElse(0.0);
    System.out.println("Average sales: " + averageSales);
}

public static void findTopSalesRecord(List<SalesRecord> salesRecords) {
    SalesRecord topRecord = salesRecords.stream()
            .max((record1, record2) -> Double.compare(record1.getAmount(), record2.getAmount()))
            .orElse(null);
    System.out.println("Top sales record: " + topRecord);
}

public static void parallelStreamOperations(List<SalesRecord> salesRecords) {
    long startTime = System.currentTimeMillis();
    salesRecords.parallelStream()
            .filter(record -> record.getProductCategory().equals("Electronics"))
            .sorted((record1, record2) -> record1.getDate().compareTo(record2.getDate()))
            .forEach(System.out::println);
    long endTime = System.currentTimeMillis();
    System.out.println("Parallel stream operation time: " + (endTime - startTime) + " ms");
}
