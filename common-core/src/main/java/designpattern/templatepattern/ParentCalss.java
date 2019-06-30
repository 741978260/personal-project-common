package designpattern.templatepattern;

/**
 * <p></p>
 * Created by Mumu on 2019/6/27
 */
public class ParentCalss {

     void template(){
        operation1();
        if(operation2()){
            operation3();
        }
    }

    private void operation3() {

    }

    private boolean operation2() {
        throw new RuntimeException("");
    }

    private void operation1() {

    }
}
