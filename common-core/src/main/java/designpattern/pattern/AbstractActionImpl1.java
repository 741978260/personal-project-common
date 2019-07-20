package designpattern.pattern;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/2
 */
public class AbstractActionImpl1 extends AbstractAction {
    public AbstractActionImpl1() {
        super.type = 1;
    }

    public void do1() {
        System.out.println("1-1");
    }

    public void do2() {
        System.out.println("1-2");
    }

    public void do3() {
        System.out.println("1-3");
    }

}
