package com.freemark.hello;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * ��������⣺ 
 *     java.io.FileNotFoundException: xxx does not exist. ���������Ҫ������
 *     FreeMarker jar ���µİ汾��2.3.23����ʾ Configuration ����������
 * �����Զ���������ԭ��
 *     ������� freeMarker ռλ��
 */
public class FreemarkerDemo {
    
    private static final String TEMPLATE_PATH = "src/main/java/com/freemark/hello/templates";
    private static final String CLASS_PATH = "src/main/java/com/freemark/hello";
    
    public static void main(String[] args) {
        // step1 ����freeMarker����ʵ��
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            // step2 ��ȡģ��·��
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            // step3 ��������ģ��
            Map<String, Object> dataMap = new HashMap<String, Object>();
            dataMap.put("classPath", "com.freemark.hello");
            dataMap.put("className", "AutoCodeDemo");
            dataMap.put("helloWorld", "ͨ���򵥵� <�����Զ���������> ��ʾ FreeMarker��HelloWorld��");
            // step4 ����ģ���ļ�
            Template template = configuration.getTemplate("hello.ftl");
            // step5 ��������
            File docFile = new File(CLASS_PATH + "\\" + "AutoCodeDemo.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(docFile)));
            // step6 ����ļ�
            template.process(dataMap, out);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^AutoCodeDemo.java �ļ������ɹ� !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != out) {
                    out.flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

}