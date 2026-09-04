import java.util.Scanner;

public class InventoryParser {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = fields[0].trim();
        String sku = fields[1].trim();
        String qty = fields[2].trim();

        System.out.printf("Product: %s | SKU: %s | Qty: %s%n", productName, sku, qty);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String csvLine = scanner.nextLine();
        parseInventoryRecord(csvLine);
        scanner.close();
    }
}