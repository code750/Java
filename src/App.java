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

        double Dividend1;
        double Dividend2;
        double Dividend3;

        System.out.println("Value of supply : "+valueOfSupply);
        System.out.println("VAT : "+Vat );
        System.out.println("Total : "+Total );
        System.out.println("Expense : "+(Supply * expenceRate) );
        System.out.println("Income : "+Income );
        if (Income < 10000.0){
            Dividend1 = Income * 0.5;
            Dividend2 = Income * 0.0;
            Dividend3 = Income * 0.0;
        } else {
            Dividend1 = Income * 0.5;
            Dividend2 = Income * 0.3;
            Dividend3 = Income * 0.2;
        }
        System.out.println("Dividend1 : "+Dividend1);
        System.out.println("Dividend2 : "+Dividend2);
        System.out.println("Dividend3 : "+Dividend3);
    }
}
