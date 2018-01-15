public abstract class Kaiju {

//    String monsterName;
//    int healthValue;
//    int attackValue;

    public abstract String returnName(String monsterName);

    public String returnHealthValue(int healthValue) {
        String numberAsString = Integer.toString(healthValue);
        return "Health value: " + numberAsString;
    }

    public String returnAttackValue(int attackValue){
        String numberAsString = Integer.toString(attackValue);
        return "Attack value: " + numberAsString;
    }

    public int returnHealthValueAsInt(int healthValue) {
        return healthValue;
    }

    public int returnAttackValueAsInt(int attackValue){
        return attackValue;
    }

    public String roar(String makeRoar){
        return makeRoar;
    }

}
