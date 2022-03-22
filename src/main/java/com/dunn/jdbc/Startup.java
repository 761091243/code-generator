package com.dunn.jdbc;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/**
 * 逆向生成工具类
 */
public class Startup {
    public static void main(String[] args) {
        try {
            List<String> warnings = new ArrayList<>();
            boolean overwrite = true;
            ClassLoader classloader = Thread.currentThread().getContextClassLoader();
            InputStream is = classloader.getResourceAsStream("generator/generatorConfig_base.xml");
//            InputStream is = classloader.getResourceAsStream("generatorConfig_agent.xml");*/
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(is);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            printProperties(classloader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printProperties(ClassLoader classloader){
        try {
            InputStream in = classloader.getResourceAsStream("generator/generator.properties");
            Properties prop = new Properties();
            prop.load(in);
            //加载属性列表
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                String key=it.next();
                if("targetProject2Java".equals(key)){
                    System.out.println("done!生成代码目录:"+prop.getProperty(key));
                }
            }
            in.close();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {

        }

    }
}