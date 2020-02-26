package com.example.testnet.reponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Http请求响应统一格式
 *
 * @author yangfeng
 * @date 2018年10月22日 下午15:36:25
 * Email: Feng.Yang@things-matrix.com
 */
public class APIResult<T> {
    private final static Logger LOGGER = LoggerFactory.getLogger(APIResult.class);

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    /**
     * 返回body
     */
    private T data;

    public APIResult() {
    }

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

    /*********************************请求成功提示信息***************************************/
    public static <T> APIResult<T> success(T data) {
        APIResult<T> result = new APIResult<T>();
        result.setData(data);
        result.setCode(APIResultEnum.SUCCESS.getCode());
        result.setMsg(APIResultEnum.SUCCESS.getMsg());

        return result;
    }

    public static <T> APIResult<T> success(Integer code, String msg) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }

    public static <T> APIResult<T> success(Integer code, String msg, T data) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);

        return result;
    }

    public static <T> APIResult<T> success(APIResultEnum apiResultEnum, T data) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(apiResultEnum.getCode());
        result.setMsg(apiResultEnum.getMsg());
        result.setData(data);

        return result;
    }

    /*********************************请求失败提示信息***************************************/
    public static <T> APIResult<T> error() {
        APIResult<T> result = new APIResult<T>();
        result.setCode(APIResultEnum.FAIL.getCode());
        result.setMsg(APIResultEnum.FAIL.getMsg());

        return result;
    }

    public static <T> APIResult<T> error(Integer code, String msg) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(code);
        result.setMsg(msg);

        return result;
    }

    public static <T> APIResult<T> error(Integer code, String msg, T data) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);

        return result;
    }

    public static <T> APIResult<T> error(APIResultEnum apiResultEnum) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(apiResultEnum.getCode());
        result.setMsg(apiResultEnum.getMsg());

        return result;
    }

    public static <T> APIResult<T> error(APIResultEnum apiResultEnum, T data) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(apiResultEnum.getCode());
        result.setMsg(apiResultEnum.getMsg());
        result.setData(data);

        return result;
    }

    public static <T> APIResult<T> error(T data) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(APIResultEnum.FAIL.getCode());
        result.setMsg(APIResultEnum.FAIL.getMsg());
        result.setData(data);

        return result;
    }

    public static <T> APIResult<T> build(T data, APIResultEnum resultEnum, String... msgs) {
        APIResult<T> result = new APIResult<T>();
        result.setData(data);
        result.setCode(resultEnum.getCode());
        result.setMsg(String.format(resultEnum.getMsg(), msgs));

        return result;
    }

    public static <T> APIResult<T> hystrix(String... msgs) {
        APIResult<T> result = new APIResult<T>();
        result.setCode(APIResultEnum.HYSTRIX.getCode());
        result.setMsg(String.format(APIResultEnum.HYSTRIX.getMsg(), msgs));

        return result;
    }


}
