package strategy;

/**
 * @author Skryl D.V. on 12.12.2020
 * Copyright © 2020 Perenio. All rights reserved.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
