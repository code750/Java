import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String valueOfSupply = JOptionPane.showInputDialog("Enter a Supply : ");
        Double Supply = Double.parseDouble(valueOfSupply);
        double vatRate = 0.1;
        double expenceRate = 0.3;
        double Vat = Supply * vatRate;
        double Total = Supply + Vat;
        double expence = Supply * expenceRate;
        double Income = Supply - expence;
        
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double Dividend1;
        double Dividend2;
        double Dividend3;

        System.out.println("Value of supply : "+valueOfSupply);
        System.out.println("VAT : "+Vat );
        System.out.println("Total : "+Total );
        System.out.println("Expense : "+(Supply * expenceRate) );
        System.out.println("Income : "+Income );
        if (Income < 10000.0){
            Dividend1 = Income * dividendRates[0];
            Dividend2 = Income * 0.0;
            Dividend3 = Income * 0.0;
        } else {
            Dividend1 = Income * dividendRates[0];
            Dividend2 = Income * dividendRates[1];
            Dividend3 = Income * dividendRates[2];
        }
        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend1 : "+Income * dividendRates[i]);
            i= i+1;
        }
    }
}
