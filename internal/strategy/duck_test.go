package strategy

import "testing"

func TestDuckCreating(t *testing.T) {
	mallard := NewMallardDuck()
	mallard.performFly()
	mallard.performQuack()

	mallard.SetFlyBehavior(&FlyRocketPowered{})
	mallard.performFly()

}
