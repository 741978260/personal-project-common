package designpattern.templatepattern;

/**
 * <p></p>
 * Created by Mumu on 2019/6/27
 */
public class ChildClass extends ParentCalss {

    boolean operation2() {
        return 0 == 0;
    }

    public static void main(String[] args) {

        ParentCalss parentCalss = new ChildClass();

        parentCalss.template();

        System.out.println("ok");

    }
}
