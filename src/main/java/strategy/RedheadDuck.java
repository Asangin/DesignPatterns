package begin;

/**
 * @author Skryl D.V. on 12.12.2020
 * Copyright © 2020 Perenio. All rights reserved.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.print("Redhead Duck");
    }
}
