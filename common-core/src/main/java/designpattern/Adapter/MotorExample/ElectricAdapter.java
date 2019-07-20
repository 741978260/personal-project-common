package designpattern.Adapter.MotorExample;

import designpattern.Adapter.objectadapter.Target;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//电能适配器
public class ElectricAdapter implements Motor {

    private ElectricMotor electricMotor;

    public ElectricAdapter() {
        this.electricMotor = new ElectricMotor();
    }

    public void driver() {
        electricMotor.electricDrive();
    }
}
