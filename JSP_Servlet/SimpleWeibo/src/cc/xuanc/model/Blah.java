package cc.xuanc.model;

import java.io.Serializable;
import java.util.*;

/**
 * ClassName    SimpleWeibo-Blah
 * Description  JavaBean - 封装微博等信息
 * @author      xuanc
 * @date        19-3-4 下午9:37
 * @version     1.0
 */
public class Blah implements Serializable{
    private String username;
    private String date;
    private String message;

    public Blah() {}

    public Blah(String username, String date, String message) {
        this.username = username;
        this.date = date;
        this.message = message;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUsername() {
        return this.username;
    }

    public String getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }
}
