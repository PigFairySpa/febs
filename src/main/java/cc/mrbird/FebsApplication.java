package cc.mrbird;

import cc.mrbird.common.config.FebsProperies;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("cc.mrbird.*.dao")
//@EnableConfigurationProperties({FebsProperies.class})
@EnableCaching
public class FebsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsApplication.class, args);
    }
}
