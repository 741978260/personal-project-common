package designpattern.Adapter.MotorExample;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/7/20
 */
//光能适配器
public class OpticalAdapter implements Motor{

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        this.opticalMotor = new OpticalMotor();
    }

    public void driver() {
        opticalMotor.opticalDrive();
    }
}
