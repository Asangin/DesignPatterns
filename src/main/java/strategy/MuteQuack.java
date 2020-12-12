package strategy;

/**
 * @author Skryl D.V. on 12.12.2020
 * Copyright © 2020 Perenio. All rights reserved.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
