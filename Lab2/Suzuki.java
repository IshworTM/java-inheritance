package ChapterFour.Lab2;

import ChapterFour.Lab1.Bike;

public class Suzuki extends Bike{
    @Override
    protected void start() {
        super.start();
        System.out.println("Your GXSR-1000rr has been started.");
    }

    public static void main(String[] args) {
        Suzuki gxsr = new Suzuki();
        gxsr.start();
    }
}
