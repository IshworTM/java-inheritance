package ChapterFour.Lab1;

public class Kawasaki extends Bike{
    Kawasaki(){
        this.price = 27000f;
        this.modelName = "Kawasaki";
        this.topSpeed = 270;
    }

    public void start(String name){
        super.start();
        System.out.println("Your " + name + " z900 has been started. It's a beautiful day for riding!");
    }

    public static void main(String[] args) {
        Kawasaki z900 = new Kawasaki();
        System.out.println(z900.modelName + " z900 costs Rs." + z900.price);
        z900.start(z900.modelName);
    }
}
