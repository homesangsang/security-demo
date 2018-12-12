package xyz.homesangsang.securitydb.util;

import java.util.HashMap;

public class R extends HashMap<String, Object> {

    public static final int CODE_SUCCESS = 0;
    public static final int CODE_ERROR = 500;
    public static final String MSG_SUCCESS =  "success";
    public static final String MSG_ERROR = "error";

    private int code;
    private String msg;

    public R() {
        this.code = CODE_SUCCESS;
        this.msg = MSG_SUCCESS;
    }

    public R(String msg) {
        this.code = CODE_SUCCESS;
        this.msg = msg;
    }

    public R(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static R ok() {
        return new R();
    }

    public static R ok(String msg) {
        return new R(msg);
    }

    public static R error() {
        return new R(CODE_ERROR, MSG_ERROR);
    }

    public static R error(String msg) {
        return new R(CODE_ERROR, msg);
    }
}
