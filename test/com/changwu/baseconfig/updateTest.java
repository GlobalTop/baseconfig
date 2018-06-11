package com.changwu.baseconfig;

import com.google.gson.Gson;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2018/6/11.
 */
public class updateTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void json() throws Exception {
        Update update=new Update();
        update.version="1.0";
        update.versionCode=1;
        update.versionDesc="版本更新内容：1，添加删除信用卡接口。\r\n2，添加vip认证。\r\n3，区分自定义消费，一个小时不限制。\r\n4，添加放弃任务接口，小时内不生成。\r\n5，消费任务手动生成。";
        update.versionAddress="www.baidu.com";
        update.versionForceUpdate="1";
        Gson gson=new Gson();
        String json=gson.toJson(update);
        logger.error("json：\r\n"+json);
    }
}
