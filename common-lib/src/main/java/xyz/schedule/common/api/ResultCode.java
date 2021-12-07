package xyz.schedule.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.http.HttpServletResponse;

/**
 * 返回结果
 *
 * @author DWL
 * @date 2021/12/7
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    /**
     * 请求成功
     */
    SUCCESS(HttpServletResponse.SC_OK, "请求成功"),

    /**
     * 请求失败
     */
    FAILURE(HttpServletResponse.SC_BAD_REQUEST, "请求失败"),

    /**
     * 请求未经授权
     */
    UN_AUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED, "请求未经授权"),

    /**
     * 404 未找到
     */
    NOT_FOUND(HttpServletResponse.SC_NOT_FOUND, "404 未找到"),

    /**
     * 消息不可读
     */
    MSG_NOT_READABLE(HttpServletResponse.SC_BAD_REQUEST, "消息不可读"),

    /**
     * 方法不受支持
     */
    METHOD_NOT_SUPPORTED(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "方法不受支持"),

    /**
     * 不支持媒体类型
     */
    MEDIA_TYPE_NOT_SUPPORTED(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "不支持媒体类型"),

    /**
     * 请求拒绝
     */
    REQ_REJECT(HttpServletResponse.SC_FORBIDDEN, "请求拒绝"),

    /**
     * 内部服务器错误
     */
    INTERNAL_SERVER_ERROR(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "内部服务器错误"),

    /**
     * 缺少必需的参数
     */
    PARAM_MISS(HttpServletResponse.SC_BAD_REQUEST, "缺少必需的参数"),

    /**
     * 参数类型不匹配
     */
    PARAM_TYPE_ERROR(HttpServletResponse.SC_BAD_REQUEST, "参数类型不匹配"),

    /**
     * 参数绑定错误
     */
    PARAM_BIND_ERROR(HttpServletResponse.SC_BAD_REQUEST, "参数绑定错误"),

    /**
     * 参数验证错误
     */
    PARAM_VALID_ERROR(HttpServletResponse.SC_BAD_REQUEST, "参数验证错误");

    /**
     * 错误码
     */
    final int code;

    /**
     * 错误消息
     */
    final String msg;
}
