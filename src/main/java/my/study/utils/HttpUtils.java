package my.study.utils;

import cn.hutool.http.HttpUtil;


/**
 * @author yanmiao.wu
 * @create 2023-03-31 10:36
 */
public class HttpUtils {

    /**
     * 使用 hutool工具类的 post请求
     */
    public static String httpPost(String url, String body) {
        String result = HttpUtil.post(url, body);
        return result;
    }

    /**
     * 尝试自己写出一个Http请求
     */
    public static void myHttpPost(){

    }

}
