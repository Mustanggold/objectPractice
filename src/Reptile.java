public class Reptile extends Animal{
    private boolean drySkin;
    private boolean backbone;
    private boolean softShelledEggs;

    public Reptile(double height, double weight, String animalType, String bloodType,
                   boolean drySkin, boolean backbone, boolean softShelledEggs) {
        super(height, weight, animalType, bloodType);
        this.drySkin = drySkin;
        this.backbone = backbone;
        this.softShelledEggs = softShelledEggs;
    }

    public boolean isDrySkin() {
        return drySkin;
    }

    public void setDrySkin(boolean drySkin) {
        this.drySkin = drySkin;
    }

    public boolean isBackbone() {
        return backbone;
    }

    public void setBackbone(boolean backbone) {
        this.backbone = backbone;
    }

    public boolean isSoftShelledEggs() {
        return softShelledEggs;
    }

    public void setSoftShelledEggs(boolean softShelledEggs) {
        this.softShelledEggs = softShelledEggs;
    }
}
