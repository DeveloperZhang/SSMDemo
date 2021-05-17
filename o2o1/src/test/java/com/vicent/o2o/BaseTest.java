package com.vicent.o2o;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 
 * 配置spring和junit整合，junit启动时加载springIOC容器
 *
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件的位置
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {

}
