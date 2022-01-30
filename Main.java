import taxTypes.IncomeTaxType;
import taxTypes.ProgressiveTaxType;
import taxTypes.VadTaxType;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
            new Bill(50000, new IncomeTaxType(), new TaxService()),
            new Bill(50000, new VadTaxType(), new TaxService()),
            new Bill(50000, new ProgressiveTaxType(), new TaxService()),
            new Bill(150000, new ProgressiveTaxType(), new TaxService())
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
