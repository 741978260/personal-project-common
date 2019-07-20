package designpattern.Adapter.objectadapter;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/19
 */
//对象适配器类
public class ObjectAdapter implements Target{
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void request() {
        adaptee.specificRequest();
    }
}
