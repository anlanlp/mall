package com.campus.mall.vo;

public class Result {
    private Integer code;
    private String msg;
    private Object data;

    // 成功返回
    public static Result success(Object data) {
        Result r = new Result();
        r.setCode(200);
        r.setMsg("success");
        r.setData(data);
        return r;
    }

    // 失败返回
    public static Result error(String msg) {
        Result r = new Result();
        r.setCode(500);
        r.setMsg(msg);
        return r;
    }

    // Getter/Setter
    public Integer getCode() { return code; }
    public void setCode(Integer code) { this.code = code; }
    public String getMsg() { return msg; }
    public void setMsg(String msg) { this.msg = msg; }
    public Object getData() { return data; }
    public void setData(Object data) { this.data = data; }
}