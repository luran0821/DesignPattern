package pattern.structural.decorator.v2;

//是否使用抽象类 看实际应用场景
public class AbstractorDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractorDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }


    public String getDesc() {
        return this.aBattercake.getDesc();
    }

    public int cost() {
        return this.aBattercake.cost();
    }
}
