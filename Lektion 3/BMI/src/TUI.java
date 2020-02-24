import java.util.Scanner;

public class TUI {
    private IFunktionalitet funk;
    public TUI(IFunktionalitet funk){
        this.funk = funk;
    }
    public void dialog(){
        Scanner scan = new Scanner(System.in);
        String cpr;
        System.out.print("Type in CPR: ");
        cpr = scan.nextLine().trim();
        System.out.println(funk.getName(cpr) + "'s BMI is: " + funk.getBMI(cpr) + "\n" + funk.getTextualBMI(cpr));
        scan.close();
    }
}
