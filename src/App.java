public class App {
    public static void main(String[] args) throws Exception {
        double valueOfSupply = 10000.0;
        double vatRate = 0.1;
        double expenceRate = 0.3;
        double Vat = valueOfSupply * vatRate;
        double Total = valueOfSupply + valueOfSupply * vatRate;
        double Income = valueOfSupply - valueOfSupply * expenceRate;
        double Dividend = valueOfSupply - valueOfSupply * 0.3;

        System.out.println("Value of supply : "+valueOfSupply);
        System.out.println("VAT : "+Vat );
        System.out.println("Total : "+Total );
        System.out.println("Expense : "+(valueOfSupply * expenceRate) );
        System.out.println("Income : "+Income );
        System.out.println("Dividend 1 : "+Dividend  * 0.5);
        System.out.println("Dividend 2 : "+Dividend * 0.3 );
        System.out.println("Dividend 3 : "+Dividend * 0.2 );
    }
}
