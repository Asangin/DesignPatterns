package strategy;

/**
 * @author Skryl D.V. on 12.12.2020
 * Copyright © 2020 Perenio. All rights reserved.
 */
public class DuckMunock {
    QuackBehavior quackBehavior;

    public DuckMunock() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
