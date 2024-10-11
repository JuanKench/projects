public class Car {
    private double meterSettingYear;
    private double meterSetting;
    private double fuel;
    public Car(double meterSetting, double meterSettingYear, double fuel){
        this.fuel = fuel;
        this.meterSetting = meterSetting;
        this.meterSettingYear = meterSettingYear;
    }

    public double getMeterSettingYear(){
        return meterSettingYear;
    }
    public double getFuel(){
        return fuel;
    }
    public double getMeterSetting(){
        return meterSetting;
    }

}
