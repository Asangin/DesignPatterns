package strategy;

/**
 * @author Skryl D.V. on 12.12.2020
 * Copyright © 2020 Perenio. All rights reserved.
 */
public class DuckMunnock {
    QuackBehavior quackBehavior;

    public DuckMunnock() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
