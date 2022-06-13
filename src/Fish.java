public class Fish extends Animal{
    private boolean liveInWater;
    private boolean hasGills;

    public Fish(double height, double weight, String animalType, String bloodType,
                boolean liveInWater, boolean hasGills) {
        super(height, weight, animalType, bloodType);
        this.liveInWater = liveInWater;
        this.hasGills = hasGills;
    }

    public boolean isLiveInWater() {
        return liveInWater;
    }

    public void setLiveInWater(boolean liveInWater) {
        this.liveInWater = liveInWater;
    }

    public boolean isHasGills() {
        return hasGills;
    }

    public void setHasGills(boolean hasGills) {
        this.hasGills = hasGills;
    }
}
