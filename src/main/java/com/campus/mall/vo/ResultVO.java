package com.campus.mall.vo;

/**
 * 统一接口返回结果
 * 所有接口都返回这个格式，前端解析更方便
 */
public class ResultVO<T> {
    // 响应码：200=成功，500=失败
    private Integer code;
    // 响应消息
    private String msg;
    // 响应数据（泛型，可传任意类型：字符串、用户对象等）
    private T data;

    // 快速创建「成功」响应（无数据）
    public static <T> ResultVO<T> success(String msg) {
        return new ResultVO<>(200, msg, null);
    }

    // 快速创建「成功」响应（带数据）
    public static <T> ResultVO<T> success(String msg, T data) {
        return new ResultVO<>(200, msg, data);
    }

    // 快速创建「失败」响应
    public static <T> ResultVO<T> error(String msg) {
        return new ResultVO<>(500, msg, null);
    }

    // 构造方法（私有，只能通过静态方法创建）
    private ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    // Getter & Setter（JSON序列化需要）
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}