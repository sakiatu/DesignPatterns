public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
    OldCoffeeMachine coffeeMachine;

    public CoffeeTouchScreenAdapter(OldCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        coffeeMachine.selectA();

    }

    @Override
    public void chooseSecondSelection() {
        coffeeMachine.selectB();
    }
}
