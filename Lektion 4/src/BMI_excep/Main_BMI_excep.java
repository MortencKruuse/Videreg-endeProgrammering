package BMI_excep;
import BMI.Data;
import BMI.TUI;

public class Main_BMI_excep {
    public static void main(String[] args) {
        new TUI(new Funktionalitet(new Data())).dialog();
    }
}
