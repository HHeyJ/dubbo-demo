package com.hyq.rpcstudy.common;

import java.io.Serializable;

/**
 * @author nanke
 * @date 2020/3/3 下午3:29
 */
public class ParamsObject implements Serializable {

    private static final long serialVersionUID = 5060108613154380815L;

    private String interfaceName;

    private String methodName;

    private Class[] paramsTypes;

    private Object[] params;

    public ParamsObject(String interfaceName, String methodName, Class[] paramsTypes, Object[] params) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.paramsTypes = paramsTypes;
        this.params = params;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Class[] getParamsTypes() {
        return paramsTypes;
    }

    public void setParamsTypes(Class[] paramsTypes) {
        this.paramsTypes = paramsTypes;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }
}
