import javax.swing.JOptionPane;

public class App {
    public static double vatRate;
    public static String valueOfSupply = JOptionPane.showInputDialog("Enter a Supply : ");
    public static double Supply;
    public static double expenceRate;
    public static double Income;
    public static double Dividend1;
    public static double Dividend2;
    public static double Dividend3;
    public static double Vat;
    public static double Total;
    
    public static void main(String[] args) throws Exception {
        vatRate = 0.1;
        
        Supply =  Double.parseDouble(valueOfSupply);
        expenceRate = 0.3;
        Vat = getVAT();
        Total = Total();
        Income = getIncome();
        
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        prints();
        
        getDividend(Income, dividendRates);

        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend1 : "+Income * dividendRates[i]);
            i= i+1;
        }
    }

    private static void prints() {
        System.out.println("Value of supply : "+valueOfSupply);
        System.out.println("VAT : "+ Vat );
        System.out.println("Total : "+Total );
        System.out.println("Expense : " +Expence() );
        System.out.println("Income : "+Income );
    }

    private static double getIncome() {
        return Supply - Expence();
    }

    private static void getDividend(double Income, double[] dividendRates) {
        if (Income < 10000.0){
            Dividend1 = Income * dividendRates[0];
            Dividend2 = Income * 0.0;
            Dividend3 = Income * 0.0;
        } else {
            Dividend1 = Income * dividendRates[0];
            Dividend2 = Income * dividendRates[1];
            Dividend3 = Income * dividendRates[2];
        }
    }

    private static double Expence() {
        return Supply * expenceRate;
    }

    private static double Total() {
        return Supply + getVAT();
    }

    private static double getVAT() {
        return Supply * vatRate;
    }
}
