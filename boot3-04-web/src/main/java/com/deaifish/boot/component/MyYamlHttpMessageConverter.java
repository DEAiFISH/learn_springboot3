package com.deaifish.boot.component;

import com.deaifish.boot.bean.Person;
import com.deaifish.boot.config.MyConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @description TODO
 *
 * @className MyYamlHttpMessageConverter
 * @author DEAiFISH
 * @date 2023/8/2 21:12
 */
public class MyYamlHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

    private ObjectMapper objectMapper = null;//把对象转为yaml

    public MyYamlHttpMessageConverter(){
        //媒体类型
        //告诉SpringBoot这个MessageConverter支持哪种类型
        super(new MediaType("text", "yaml", StandardCharsets.UTF_8));
        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        this.objectMapper = new ObjectMapper(factory);
    }

    /**
     * @description 判断是否能转换
     * @author DEAiFISH
     * @date 2023/8/2 21:13
     * @param clazz
     * @return boolean
     */
    @Override
    protected boolean supports(Class<?> clazz) {
        //只支持对象类型，不是基本类型
        return true;
    }

    /**
     * @description 适配@RequestBody
     *
     * @author DEAiFISH
     * @date 2023/8/2 21:15
     * @param clazz
     * @param inputMessage
     * @return java.lang.Object
     */
    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    /**
     * @description 适配@ResponseBody
     *
     * @author DEAiFISH
     * @date 2023/8/2 21:15
     * @param methodReturnValue
     * @param outputMessage
     * @return void
     */
    @Override
    protected void writeInternal(Object methodReturnValue, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        //try-with写法，自动关流
        try(OutputStream os = outputMessage.getBody()){
            this.objectMapper.writeValue(os,methodReturnValue);
        }
    }

    /**
     * @description 将对象转为yaml 测试
     *
     * @author DEAiFISH
     * @date 2023/8/2 21:34
     * @param args
     * @return void
     */
    public static void test(String[] args) throws JsonProcessingException {
        Person person = new Person();
        person.setId(1L);
        person.setUserName("张三");
        person.setEmail("aaa@qq.com");
        person.setAge(18);

        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        ObjectMapper mapper = new ObjectMapper(factory);

        String s = mapper.writeValueAsString(person);
        System.out.println(s);
    }
}
