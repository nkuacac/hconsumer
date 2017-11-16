package com.service;

import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;
import com.service.controller.HConsummerImpl;
/**
 * <一句话功能简述>
 * <功能详细描述>
 *
 * @author  someguy
 * @version  [版本号, 2017年1月3日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class HconsumerApplication {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
        HConsummerImpl consummer = new HConsummerImpl();
        for(;;) {
            Integer s = consummer.add(1,2);
            System.out.println(s);
            Thread.sleep(2000);
        }
    }
}
