package designpattern.Adapter.classadapter;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/19
 */
//类适配器类
public class ClassAdapter extends Adaptee implements Target{
    public void request() {
        specificRequest();
    }
}
