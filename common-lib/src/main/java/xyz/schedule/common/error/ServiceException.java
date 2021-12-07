package xyz.schedule.common.error;

import lombok.Getter;
import xyz.schedule.common.api.ResultCode;

import java.io.Serial;

/**
 * 定义业务异常
 *
 * @author DWL
 * @date 2021/12/7
 */
public class ServiceException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -6068835258566499245L;
    @Getter
    private final ResultCode resultCode;

    public ServiceException(String message) {
        super(message);
        this.resultCode = ResultCode.FAILURE;
    }

    public ServiceException(ResultCode resultCode) {
        super(resultCode.getMsg());
        this.resultCode = resultCode;
    }

    public ServiceException(ResultCode resultCode, String msg) {
        super(msg);
        this.resultCode = resultCode;
    }

    public ServiceException(ResultCode resultCode, Throwable cause) {
        super(cause);
        this.resultCode = resultCode;
    }

    public ServiceException(String msg, Throwable cause) {
        super(msg, cause);
        this.resultCode = ResultCode.FAILURE;
    }

}
