package me.wyq.quickstart.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author wangyuanqing1
 * 2021/6/11
 */
@Component
@Aspect
public class CommonAspect {

    @Around("execution(* me.wyq.quickstart.aspect.CommonService.getName())")
    public Object handle(ProceedingJoinPoint point) throws Throwable {
        Object result = point.proceed();
        String signature = point.getSignature().toString();
        System.out.println("handle result: " + result);
        System.out.println("signature: " + signature);
        return result;
    }
}
