package com.hyq.rpcstudy.protocal.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author nanke
 * @date 2020/3/3 下午2:39
 */
public class DubboFixSetvlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            new DubboFixHandle().handle(req,resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
