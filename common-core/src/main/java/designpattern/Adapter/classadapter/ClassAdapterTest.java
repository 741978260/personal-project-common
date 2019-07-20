package designpattern.Adapter.classadapter;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/19
 */
//客户端代码
public class ClassAdapterTest {
    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }
}
