public class Crocodile extends Reptile{
    private boolean hardShelledEggs;

    public Crocodile(double height, double weight, String animalType,
                     String bloodType, boolean drySkin, boolean backbone,
                     boolean softShelledEggs, boolean hardShelledEggs) {
        super(height, weight, animalType, bloodType, drySkin, backbone, softShelledEggs);
        this.hardShelledEggs = hardShelledEggs;
    }

    private void showInfo(){
        System.out.println("Hey, I am a crocodile!");
    }
}
