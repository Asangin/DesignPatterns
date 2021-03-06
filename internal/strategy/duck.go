package strategy

import "fmt"

type Duck struct {
	flyBehavior   FlyBehavior
	quackBehavior QuackBehavior
	display       string
}

func NewMallardDuck() *Duck {
	return &Duck{
		flyBehavior:   &FlyWithWings{},
		quackBehavior: &Quack{},
		display:       "Mallard Duck",
	}
}

func (d *Duck) performFly() {
	d.flyBehavior.fly()
}

func (d *Duck) performQuack() {
	d.quackBehavior.quack()
}

func (d *Duck) SetFlyBehavior(f FlyBehavior) {
	d.flyBehavior = f
}

func (d *Duck) SetQuackBehavior(q QuackBehavior) {
	d.quackBehavior = q
}

func (d *Duck) Display() {
	fmt.Println(d.display)
}

type FlyBehavior interface {
	fly()
}

type FlyWithWings struct{}

func (f *FlyWithWings) fly() {
	fmt.Println("Fly with wings")
}

type FlyRocketPowered struct{}

func (f *FlyRocketPowered) fly() {
	fmt.Println("FlyRocketPowered")
}

type QuackBehavior interface {
	quack()
}

type Quack struct{}

func (q *Quack) quack() {
	fmt.Println("Quack")
}
