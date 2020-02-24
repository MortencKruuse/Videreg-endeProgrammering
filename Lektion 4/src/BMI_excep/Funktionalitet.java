package BMI_excep;

import BMI.IData;

public class Funktionalitet implements IFunktionalitet {
    private IData data;
    public Funktionalitet(IData data){
        this.data = data;
    }
    @Override
    public double getBMI(String cpr) throws DataException {
        return data.getWeight(cpr) / (Math.pow(data.getHeight(cpr),2));
    }

    @Override
    public String getTextualBMI(String cpr) throws DataException{
        double bmi = getBMI(cpr);
        if (bmi < 16.5)
            return "Seriously Underweight";
        else if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.99)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    @Override
    public String getName(String cpr) throws DataException {
        return data.getName(cpr);
    }
}
