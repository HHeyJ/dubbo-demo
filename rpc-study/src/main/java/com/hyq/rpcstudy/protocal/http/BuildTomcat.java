package com.hyq.rpcstudy.protocal.http;

import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.core.StandardEngine;
import org.apache.catalina.core.StandardHost;
import org.apache.catalina.startup.Tomcat;

/**
 * @author nanke
 * @date 2020/3/3 下午2:20
 */
public class BuildTomcat {

    public static void start(String hostName, Integer port) {

        Tomcat tomcat = new Tomcat();

        Context context = new StandardContext();
        context.setPath("");
        context.addLifecycleListener(new Tomcat.FixContextListener());

        Host host = new StandardHost();
        host.setName(hostName);
        host.addChild(context);

        Engine engine = new StandardEngine();
        engine.setDefaultHost(hostName);
        engine.addChild(host);

        Connector connector = new Connector();
        connector.setPort(port);

        Server server = tomcat.getServer();
        Service service = server.findService("Tomcat");
        service.setContainer(engine);
        service.addConnector(connector);

        tomcat.addServlet("","dubboServlet",new DubboFixSetvlet());
        context.addServletMappingDecoded("/*","dubboServlet");

        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
