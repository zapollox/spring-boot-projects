package com.apollo.business.constant;

/**
 * Created by superlee on 2017/11/6.
 * [1000 - 1999] 登录注册，权限校验
 * [3000 - 3999] 项目模块
 * [2000 - 2999]  信用模块
 * [9000 - 9999]  系统通用模块
 * [4000 - 4999] 数据获取模块
 */
public enum Code {
    //通用部分
    UNKNOWN_ABNORMAL(9002, "未知异常"),
    TOKEN_CRYPT_ERROR(9111, "token加解密异常");




    private int code;
    private String msg;

    // 构造方法
    Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static String getMsgByCodeInt(int codeInt) {
        for (Code e : Code.values()) {
            if (e.getCode() == codeInt) {
                return e.msg;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }

    public static Code getCodeByCodeInt(int codeInt) {
        for (Code code : Code.values()) {
            if (code.getCode() == codeInt) {
                return code;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }


}
