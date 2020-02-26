package com.example.testnet.reponse;

/**
 * Http请求响应-状态
 *
 * @author yangfeng
 * @date 2018年10月22日 下午15:36:25
 * Email: Feng.Yang@things-matrix.com
 */
public enum APIResultEnum {

    UNKOWM_ERROR(-1, "unknown error"), // 未知错误
    SUCCESS(0, "success"), // 成功
    FAIL(9999, "fail"), // 失败
    ACCESS_FAILED(10000,"[%s]"),//获取资源失败

    VALID_FAIL(10001, "request body check error[%s]"), // 请求参数校验错误
    HYSTRIX(10002,"[%s] service invocation failed"), // 服务条用失败
    PK_DUPLICATE(10003,"duplicate record"), // 数据库中已存在该记录
    FAIL_EDIT(10004, "edit failed"), // 编辑失败
    FAIL_QUERY(10005, "query failed"), // 查询失败
    FAIL_DEL(10006, "delete failed"), // 删除失败
    NON_EXIST(10007, "[%s] non-existent"), // 不存在
    NON_MATCH(10008,"[%s][%s] do not match"), // 不匹配
    RESOURCE_ACCESS_FAIL(10009, "[%s] resource access failed"), // 资源访问失败
    EMPTY_NONSUPPORT(10010, "[%s] cannot be empty"), // 不能为空
    NOT_ALLOWED_EDIT(10011,"[%s] isn't allowed to be edited"), // 不能被编辑
    NOT_ALLOWED_DEL(10012,"[%s] isn't allowed to be deleted"), // 不能被删除
    ALREADY_EXIST(10013,"[%s] already exists"), // 已经存在
    UPPER_lIMIT(10017,"[%s] Reached the upper limit"),//已达数量上限
    NOT_EMPTY(10018,"[%s] Can not be empty"),//不能为空
    PARSE_ERROR(10014, "request body parse error"), // 请求体读取异常（Json parse error）
    UK_DUPLICATE(10015,"unique field(sn/code etc.) already exists"), // 数据库中已存在该记录
    READ_ONLY(10016, "[%s] read only"),
    MAPPING_NON_EXIST(10017,"[%s]the company mapping label does not exist"),
    INPUT_ERROR_DATE(10018,"The start time cannot be greater than the end time"),
    INPUT_ERROR_DATE2(10019,"The end time should not be greater than the current time"),
    MODIFY_STATUS_CUSTOMER_ERROR(10020,"Only the SIM card of xiaodian company is allowed to be modified"),
    MODIFY_STATUS_ERROR(10021,"Failed to modify status, please try again!"),
    FAIL_ACC_STATUS(10022,"TEST_READY, ACTIVATION_READY,ACTIVATED ,DEACTIVATED"),
    ONLY_SUPPORTS_SPECIFIC_OPERATOR(10023, "[%s] This operation only supports specific operator: [%s]"),
    // auth
    AUTH_INVALID_TOKEN(14101, "invalid token"), // 无效的Token

    // file
    FILE_FORMAT(14301, "File format valid fail"), // 文件格式校验错误码
    FILE_EMPTY("File is empty"), // 文件为空
    FILE_DATA_EMPTY("File data is empty"), // 文件读取数据为空
    FILE_IMPORT_LIMIT("Import exceeded maximum limit"), // 导入支持5000行数据
    FILE_EXTENSION("File format is not supported"), // 文件格式不支持
    FILE_READ_ERR("File read error"), // 文件读取错误
    FILE_TABLE_HEADER_ERR("Table header error: %s"), // table header格式有误
    FILE_DATA_ROW_ERR("Data row format error"), // 数据行为空或者数据列数缺失
    FILE_ICCID_EMPTY("The iccid is empty"), // iccid为空
    FILE_IMSI_EMPTY("The imsi is empty"), // iccid为空
    FILE_ICCID_FORMAT_ERR("iccid format error"), // iccid格式错误(必须为20位数字)
    FILE_IMSI_FORMAT_ERR("imsi format error"), // imsi格式错误(必须为20位数字)
    FILE_PROVIDER_FORMAT_ERR("provider format error"), // provider格式错误字数必须是0-50）
    FILE_STATUS_FORMAT_ERR("localSimStatus format error"), // 状态值填写错误
    FILE_DESC_FORMAT_ERR("Description format error"), // 描述格式错误（字数必须是0-200）
    FILE_ICCID_REPEAT("Repeated iccid serial number(%s)"), // iccid重复
    FILE_ICCID_EXIST("iccid Serial number already exists"), // iccid已存在
    FILE_IMSI_REPEAT("Repeated imsi serial number(%s)"), // imsi重复
    FILE_IMSI_EXIST("imsi Serial number already exists"), // imsi已存在
    FILE_DATA(14302, "File data valid fail"); // 文件数据校验错误码

    private Integer code;

    private String msg;

    APIResultEnum() {
    }

    APIResultEnum(String msg) {
        this.msg = msg;
    }

    APIResultEnum(Integer code) {
        this.code = code;
    }

    APIResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
