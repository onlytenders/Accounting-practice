package taxTypes;

public class VadTaxType extends TaxType {
    @Override
    public double calculateTaxFor (double amount) {
        return amount * 0.18;
    }
}
