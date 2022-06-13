public class Birds extends Animal{
    private boolean animalsWithFeathers;
    private boolean canFly;

    public Birds(double height, double weight, String animalType, String bloodType,
                 boolean animalsWithFeathers, boolean canFly) {
        super(height, weight, animalType, bloodType);
        this.animalsWithFeathers = animalsWithFeathers;
        this.canFly = canFly;
    }

    public boolean isAnimalsWithFeathers() {
        return animalsWithFeathers;
    }

    public void setAnimalsWithFeathers(boolean animalsWithFeathers) {
        this.animalsWithFeathers = animalsWithFeathers;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
