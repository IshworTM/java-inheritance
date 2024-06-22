package ChapterFour.Lab3;

import ChapterFour.Lab1.Bike;

//Single-Inheritance
public class Ducati extends Bike{
    @Override
    public void start() {
        super.start();
        System.out.println("Your Ducati Superleggera V4 has been started. :0");
    }

    public static void main(String[] args) {
        Ducati ducati = new Ducati();
        ducati.start();
    }
}
