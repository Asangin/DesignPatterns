package strategy;

import org.junit.jupiter.api.Test;

/**
 * @author Skryl D.V. on 12.12.2020
 * Copyright © 2020 Perenio. All rights reserved.
 */
public class MiniDuckSimulatorTest {

    @Test
    void createNewDuckTest() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }

    @Test
    void changeDuckBehaviorOnTheFly() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
