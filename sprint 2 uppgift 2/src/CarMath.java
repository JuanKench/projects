public class CarMath {

    public double distance(Car data){
        return data.getMeterSetting() - data.getMeterSettingYear();
    }
    public double fuelUse(Car data){
        double distance = distance(data);
        if (distance == 0){
            return 0;
        }
        return data.getFuel() /distance;

    }
}
