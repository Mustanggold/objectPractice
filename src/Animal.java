public class Animal {
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;

    public Animal(double height, double weight, String animalType, String bloodType) {
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return String.format("The animal is %.2f cm tall and weighed %.2f kilos." +
                            " It's a %s type animal with a blood type of %s.",
                                height, weight, animalType, bloodType);
    }
}
