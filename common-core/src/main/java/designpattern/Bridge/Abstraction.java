package designpattern.Bridge;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//抽象化角色
public abstract class Abstraction {
    protected Implementor imple;

    protected Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void Operation();
}
