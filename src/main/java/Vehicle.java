public abstract class Vehicle {

    public abstract String returnType (String type);

    public String returnHealthValue(int healthValue) {
        String numberAsString = Integer.toString(healthValue);
        return "Health value: " + numberAsString;
    }
}
