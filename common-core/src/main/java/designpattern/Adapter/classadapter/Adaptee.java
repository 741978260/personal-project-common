package designpattern.Adapter.classadapter;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/19
 */
//适配者类
public class Adaptee {
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}
