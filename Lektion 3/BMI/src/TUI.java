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
        String name = funk.getName(cpr);
        System.out.println(name + "'s BMI is: " + funk.getBMI(cpr) + "\nThe description for " + name + "'s BMI is: \"" + funk.getTextualBMI(cpr) + "\"");
        scan.close();
    }
}
