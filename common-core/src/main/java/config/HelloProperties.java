package config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description
 * @Author Created by Mumu
 * @Date on 2019/6/30
 */
@Data
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private String msg = "test";
    private boolean show = true;


}
