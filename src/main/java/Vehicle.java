public abstract class Vehicle {

    String type;
    int healthValue;

    public Vehicle (String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;}

    public abstract String returnType (String type);

    public String returnHealthValue(int healthValue) {
        String numberAsString = Integer.toString(healthValue);
        return "Health value: " + numberAsString;
    }

    public int returnHealthValueAsInt(int healthValue) {
        return healthValue;
    }
}
