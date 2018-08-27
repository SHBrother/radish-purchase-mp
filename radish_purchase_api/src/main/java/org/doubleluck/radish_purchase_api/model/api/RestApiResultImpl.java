package org.doubleluck.radish_purchase_api.model.api;

import java.util.HashMap;

/**
 *  API 规范返回值 封装类 SERVER 与 前端 交互
 *  @author lzf
 */
public class RestApiResultImpl extends HashMap<String, Object> implements RestApiResult {

    public static final RestApiResult TRUE_REST_API_RESULT = new RestApiResultImpl();
    public static final RestApiResult FALSE_NOT_LOGIN = new RestApiResultImpl(false, RestApiResult.NOT_LOGIN, "未登录", null);

    public static RestApiResult buildFromException(RestApiResult e) {
        return new RestApiResultImpl(false, e.getErrorCode(), e.getErrorMsg(), null);
    }

    /**
     *
     * @param success   true,//状态true，false
     * @param errorCode 12345,//errorCode
     * @param errorMsg  '',//errorMsg
     * @param data  {}//返回数据
     *
     */
    public RestApiResultImpl(Boolean success, Integer errorCode, String errorMsg, Object data) {
        super(4);
        this.put("success", success);
        this.put("errorCode", errorCode);
        this.put("errorMsg", errorMsg);
        this.put("data", data);
    }

    /**
     * 操作成功，有返回数据
     * @param data
     */
    public RestApiResultImpl(Object data){
        super(4);
        this.put("success", true);
        this.put("errorCode", 0);
        this.put("errorMsg", "");
        this.put("data", data);
    }

    /**
     * 操作成功，无返回数据
     */
    private RestApiResultImpl(){
        super(4);
        this.put("success", true);
        this.put("errorCode", 0);
        this.put("errorMsg", "");
        this.put("data", null);
    }

    @Override
    public boolean isSuccess() {
        return Boolean.parseBoolean(get("success").toString());
    }

    @Override
    public int getErrorCode() {
        return Integer.parseInt(get("errorCode").toString());
    }

    @Override
    public String getErrorMsg() {
        return get("errorMsg").toString();
    }

    @Override
    public Object getData() {
        return get("data");
    }

}
