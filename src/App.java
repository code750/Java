import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valueOfSupply = JOptionPane.showInputDialog("Enter a Supply : ");
        Double Supply = Double.parseDouble(valueOfSupply);
        double vatRate = 0.1;
        double expenceRate = 0.3;
        double Vat = Supply * vatRate;
        double Total = Supply + Supply * vatRate;
        double Income = Supply - Supply * expenceRate;
        double Dividend = Supply - Supply * 0.3;

        System.out.println("Value of supply : "+valueOfSupply);
        System.out.println("VAT : "+Vat );
        System.out.println("Total : "+Total );
        System.out.println("Expense : "+(Supply * expenceRate) );
        System.out.println("Income : "+Income );
        System.out.println("Dividend 1 : "+Dividend  * 0.5);
        System.out.println("Dividend 2 : "+Dividend * 0.3 );
        System.out.println("Dividend 3 : "+Dividend * 0.2 );
    }
}
