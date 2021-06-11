package me.wyq.quickstart.aspect;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Map;

@SpringBootTest
class QuickstartAspectApplicationTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        Map<String, CommonService> map = applicationContext.getBeansOfType(CommonService.class);
        map.forEach((key, value) -> {
            System.out.println("key: " + key);
            System.out.println("value: " + value.getName());
        });
    }

}
