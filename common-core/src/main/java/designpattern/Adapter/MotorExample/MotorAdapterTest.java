package designpattern.Adapter.MotorExample;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//客户端代码
public class MotorAdapterTest {

    public static void main(String[] args) {

        System.out.println("适配器模式测试：");
        Motor motor = (Motor) ReadXML1.getObject();
        motor.driver();
    }

}
