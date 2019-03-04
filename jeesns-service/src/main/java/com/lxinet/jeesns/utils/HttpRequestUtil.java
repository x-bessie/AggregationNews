package com.lxinet.jeesns.utils;

import org.apache.commons.io.IOUtils;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * http帮助类,用户请求接口用
 */
public class HttpRequestUtil {
    public static Logger logger = Logger.getLogger(HttpRequestUtil.class.getName());

    /**
     * @param url   发送请求的URL
     * @param param 请求参数，请求参数应该是name1=value1&name2=value2的形式
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {

        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            if (param == null || "".equalsIgnoreCase(param.trim())) {
                urlNameString = url;
            }
            URL realUrl = new URL(urlNameString);
            //打开和URL之间的连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
/*			System.setProperty("sun.net.client.defaultConnectTimeout", "30000");
			System.setProperty("sun.net.client.defaultReadTimeout", "30000");*/
            //设置通用的请求属性
/*			connection.setConnectTimeout(10000);
			connection.setReadTimeout(20000);
			connection.setDoOutput(false);
			connection.setDoInput(true);*/
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.setRequestMethod("GET");
            //建立实际的连接
            connection.connect();
            //定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }

        } catch (Exception e) {
            logger.info("GET发送异常！" + e);
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                logger.info("GET请求异常！");
            }
        }
        return result;
    }

    /**
     * @param url   发送请求的URL
     * @param param 请求参数（name1=vlaue1&name2=value2）
     * @return 远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        OutputStreamWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            HttpURLConnection conn = null;
            //打开URL之间的连接
            conn = (HttpURLConnection) realUrl.openConnection();
            //发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");

            //设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");


            conn.connect();

            //获取URLConnection对象对应的输出流
            out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            //发送请求参数
            out.write(param);
            //输出流的缓冲
            out.flush();
            //定义BufferedReader的输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
//            System.out.println("获取的结果为：" + result);
        } catch (Exception e) {
            logger.info("POST 请求发送异常！");
            e.printStackTrace();
        } finally {
            //发送成功失败都得关掉输入、输出流
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                logger.info("POST请求发送失败！");
            }
        }
        return result;
    }

    /**
     * 发送Http post 请求
     *
     * @param info（json字符串）
     * @param Url           （url请求路径）
     * @return 返回信息
     */
    public static String doHttpPost(String info, String Url) {
        byte[] infoData = info.getBytes();
        InputStream instr = null;
        //ByteArrayOutputStream out = null;
        String ResponseString = null;
        try {
            URL url = new URL(Url);
            URLConnection urlCon = url.openConnection();
            urlCon.setDoOutput(true);
            urlCon.setDoInput(true);
            urlCon.setUseCaches(false);
            urlCon.setRequestProperty("content-Type", "application/json");
            urlCon.setRequestProperty("charset", "utf-8");
            urlCon.setRequestProperty("Content-length", String.valueOf(infoData.length));
            DataOutputStream printout = new DataOutputStream(urlCon.getOutputStream());
            printout.write(infoData);
            printout.flush();
            printout.close();
            instr = urlCon.getInputStream();
            byte[] bis = IOUtils.toByteArray(instr);
            ResponseString = new String(bis, "UTF-8");
            if ((ResponseString == null) || ("".equals(ResponseString.trim()))) {
                return null;
            }
            return ResponseString;
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("POST请求发送失败！" + e.getMessage());
        } finally {
            try {
                //out.close();
                instr.close();
            } catch (Exception e2) {
                logger.info("POST请求发送失败!" + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return ResponseString;
    }


    private static class TrustAnyTrustManager implements X509TrustManager {

        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

    }

    private static class TrustAnyHostnameVerifier implements HostnameVerifier {
        public boolean verify(String hostname, SSLSession session) {
            return true;
        }
    }

    String _url = "";

    Map<String, String> _params;

    public void HttpsGetData(String url, Map<String, String> keyValueParams) {
        this._url = url;
        if (url == null || "".equalsIgnoreCase(url.trim())) {
            return;
        }
        this._params = keyValueParams;
    }

    public String Do() throws Exception {
        String result = "";
        BufferedReader in = null;
        try {
            String URL = getParamStr();
            String urlStr = null;
            if (URL == null || "".equalsIgnoreCase(URL.trim())) {
                urlStr = this._url;
            } else {
                urlStr = this._url + "?" + getParamStr();
            }
            System.out.println("GET请求的URL为：" + urlStr);
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, new TrustManager[]{new TrustAnyTrustManager()}, new java.security.SecureRandom());
            URL realUrl = new URL(urlStr);
            // 打开和URL之间的连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();   //用HttpsURLConnection那个不行
            //设置https相关属性
//            connection.setSSLSocketFactory(sc.getSocketFactory());
//            connection.setHostnameVerifier(new TrustAnyHostnameVerifier());
            connection.setDoOutput(true);


            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

            // 建立实际的连接
            connection.connect();

            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
//            System.out.println("获取的结果为：" + result);
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
            throw e;
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                //e2.printStackTrace();
                throw e2;
            }
        }
        return result;

    }

    private String getParamStr() {
        String paramStr = "";

        // 获取所有响应头字段
        Map<String, String> params = this._params;
        if (params == null || params.size() == 0) {
            return paramStr;
        }
        // 获取参数列表组成参数字符串
        for (String key : params.keySet()) {
            paramStr += key + "=" + params.get(key) + "&";
        }
        //去除最后一个"&"
        paramStr = paramStr.substring(0, paramStr.length() - 1);

        return paramStr;
    }

    public static void main(String[] args) {
//        HttpRequestUtil httpRequestUtil = new HttpRequestUtil();
//
//        try {
//
////            String urladdress = "https://newsapi.org/v2/everything?";
//            String urladdress = "https://newsapi.org/v2/top-headlines";
//            Map<String, String> map = new HashMap<String, String>();
//
////            map.put("country","cn");
//            map.put("apiKey", "2c2b3417e7584cb2abcf19564789864d");
//
//            map.put("q", "全国人大");
////            testBaidu.HttpsGetData(url, map);
////            testBaidu.Do();
////            StringBuffer sb = new StringBuffer();
////            for (String key : map.keySet()) {
////                sb.append(key + "=" + map.get(key));
////            }
////            String result = httpRequestUtil.sendGet(urladdress.trim(), sb.toString().trim());
////            System.out.println(urladdress+sb.toString());
//            httpRequestUtil.HttpsGetData(urladdress.trim(), map);
//
//            String result = httpRequestUtil.Do();
//            System.out.println(result);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        HttpRequestUtil httpRequestUtil=new HttpRequestUtil();
//        String url="https://newsapi.org/v2/everything?";


    }
}