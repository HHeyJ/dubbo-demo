package com.hyq.providerdemo.api;

import java.io.Serializable;

/**
 * @author nanke
 * @date 2020/2/28 下午5:57
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 2519229232662050525L;

    /**
     * 状态
     */
    private boolean status;

    /**
     * 错误消息
     */
    private String message;

    /**
     * 返回值
     */
    private int responseCode;

    /**
     * 结果对象
     */
    private T entry;

    /**
     * 分页对象
     */
    private int count;

    /**
     * 推荐使用 消除类型校验出现idea 提示
     *
     * @param entry 实体
     * @param count 查询时总数量
     * @param <T>
     * @return t
     */
    public static <T> Result<T> buildSuccess(T entry, int count) {
        Result<T> result = new Result<>();
        result.setStatus(true);
        result.setEntry(entry);
        result.setCount(count);
        return result;
    }

    /**
     * 推荐使用 消除类型校验出现idea 提示
     *
     * @param entry 实体
     * @param <T>   类型
     * @return Result
     */
    public static <T> Result<T> buildSuccess(T entry) {
        return buildSuccess(entry, 0);
    }

    /**
     * 推荐使用 消除类型校验出现idea 提示
     *
     * @param msg 实体
     * @param responseCode 查询时总数量
     * @param <T>
     * @return t
     */
    public static <T> Result<T> buildFail(String msg, int responseCode) {
        Result<T> result = new Result<>();
        result.setStatus(false);
        result.setMessage(msg);
        result.setResponseCode(responseCode);
        return result;
    }

    /**
     * 推荐使用 消除类型校验出现idea 提示
     *
     * @param msg 实体
     * @param <T>
     * @return t
     */
    public static <T> Result<T> buildFail(String msg) {
        return buildFail(msg,0);
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public T getEntry() {
        return entry;
    }

    public void setEntry(T entry) {
        this.entry = entry;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
