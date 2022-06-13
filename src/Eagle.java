public class Eagle extends Birds{
    public Eagle(double height, double weight, String animalType, String bloodType,
                 boolean animalsWithFeathers, boolean canFly) {
        super(height, weight, animalType, bloodType, animalsWithFeathers, canFly);
    }

    private void showInfor(){
        System.out.println("Hey, I am an eagle!");
    }
}
