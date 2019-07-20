package designpattern.pattern;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/2
 */
public abstract class AbstractAction implements IAction {
    private static final int type1 = 1;
    private static final int type2 = 2;
    private static final int type3 = 3;

    protected Integer type;

    public abstract void do1();

    public abstract void do2();

    public abstract void do3();

    public void doSomething() {
        switch (this.type) {
            case 1:
                this.do1();
                break;
            case 2:
                this.do2();
                break;
            case 3:
                this.do3();
                break;
        }
    }
}
