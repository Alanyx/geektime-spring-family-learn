package geektime.spring.springbucks.waiter.support;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@ConfigurationProperties("order")
// 会刷新
@RefreshScope
@Data
@Component
public class OrderProperties {
    /**
     * 相当配置文件中的 order.discount
     */
    private Integer discount = 100;
    private String waiterPrefix = "springbucks-";
}
