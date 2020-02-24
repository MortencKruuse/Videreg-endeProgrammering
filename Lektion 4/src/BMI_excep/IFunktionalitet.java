package BMI_excep;

public interface IFunktionalitet {
    double getBMI(String cpr) throws DataException;
    String getTextualBMI(String cpr) throws DataException;
    String getName(String cpr) throws DataException;
}
