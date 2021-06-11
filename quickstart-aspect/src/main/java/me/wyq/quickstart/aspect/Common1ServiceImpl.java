package me.wyq.quickstart.aspect;

import org.springframework.stereotype.Service;

/**
 * @author wangyuanqing1
 * 2021/6/11
 */
@Service
public class Common1ServiceImpl implements CommonService {
    @Override
    public String getName() {
        return Common1ServiceImpl.class.getName();
    }
}
