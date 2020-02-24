public class Funktionalitet implements IFunktionalitet {
    private IData data;
    public Funktionalitet(){
        data = new Data();
    }
    @Override
    public double getBMI(String cpr) {
        return data.getWeight(cpr) / (Math.pow(data.getHeight(cpr),2));
    }

    @Override
    public String getTextualBMI(String cpr) {
        double bmi = getBMI(cpr);
        if (bmi < 16.5)
            return "Seriously Underweight";
        else if (bmi >= 16.5 && bmi < 18.5)
            return "Underweight";
        else if (bmi >= 18.5 && bmi < 24.99)
            return "Normal";
        else if (bmi >= 25 && bmi < 30)
            return "Overweight";
        else if (bmi >= 30)
            return "Obese";
        return null;
    }

    @Override
    public String getName(String cpr) {
        return data.getName(cpr);
    }
}