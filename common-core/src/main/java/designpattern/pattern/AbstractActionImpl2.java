package designpattern.pattern;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/2
 */
public class AbstractActionImpl2 extends AbstractAction {
    public AbstractActionImpl2() {
        super.type = 2;
    }

    public void do1() {
        System.out.println("2-1");
    }

    public void do2() {
        System.out.println("2-2");
    }

    public void do3() {
        System.out.println("2-3");
    }

}
