package com.hyq.rpcstudy.protocal.http;

import com.hyq.rpcstudy.common.ParamsObject;
import com.hyq.rpcstudy.provider.register.LocalRegister;
import org.apache.commons.io.IOUtils;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;

/**
 * @author nanke
 * @date 2020/3/3 下午3:12
 */
public class DubboFixHandle {

    public void handle(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        // 处理请求，写出数据
        ServletInputStream inputStream = req.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        ParamsObject paramsObject = (ParamsObject)ois.readObject();

        Class implClass = LocalRegister.get(paramsObject.getInterfaceName());
        Method method = implClass.getMethod(paramsObject.getMethodName(),paramsObject.getParamsTypes());
        String invoke = (String) method.invoke(implClass.newInstance(), paramsObject.getParams());

        IOUtils.write(invoke,resp.getOutputStream(),"UTF-8");
    }
}
