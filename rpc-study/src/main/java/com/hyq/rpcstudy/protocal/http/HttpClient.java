package com.hyq.rpcstudy.protocal.http;

import com.hyq.rpcstudy.common.ParamsObject;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author nanke
 * @date 2020/3/3 下午3:29
 */
public class HttpClient {

    public static String post(String hostName, Integer port, ParamsObject paramsObject) throws IOException {

        ObjectOutputStream oos = null;
        try {

            URL url = new URL("http",hostName,port,"/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);

            OutputStream outputStream = httpURLConnection.getOutputStream();
            oos = new ObjectOutputStream(outputStream);

            oos.writeObject(paramsObject);
            oos.flush();

            InputStream inputStream = httpURLConnection.getInputStream();
            String result = IOUtils.toString(inputStream,"UTF-8");
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
        return null;
    }
}
