public class Eel extends Fish{
    private boolean releaseElectricCharge;

    public Eel(double height, double weight, String animalType, String bloodType,
               boolean liveInWater, boolean hasGills, boolean releaseElectricCharge) {
        super(height, weight, animalType, bloodType, liveInWater, hasGills);
        this.releaseElectricCharge = releaseElectricCharge;
    }

    private void showInfo(){
        System.out.println("Hey, I am an eel!");
    }

    public boolean isReleaseElectricCharge() {
        return releaseElectricCharge;
    }

    public void setReleaseElectricCharge(boolean releaseElectricCharge) {
        this.releaseElectricCharge = releaseElectricCharge;
    }
}
