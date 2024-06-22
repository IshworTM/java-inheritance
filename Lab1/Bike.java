package ChapterFour.Lab1;

public class Bike {
    public float price;
    private String modelNumber;
    String modelName; // Automatically uses Default access modifier (package-private)
    protected int topSpeed;

    protected void start(){
        System.out.println("Starting the Bike.....");
    }

    public static void main(String[] args) {
        Bike ninjah2 = new Bike();

        System.out.println("Public Access Modifier: "+ninjah2.price);
        System.out.println("Private Access Modifier: "+ninjah2.modelNumber);
        System.out.println("Default Access Modifier: "+ninjah2.modelName);
        System.out.println("Protected Access Modifier: "+ninjah2.topSpeed);
    }
}
