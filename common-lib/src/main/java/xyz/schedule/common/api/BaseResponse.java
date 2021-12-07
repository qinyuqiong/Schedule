package xyz.schedule.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基本响应
 *
 * @author DWL
 * @date 2021/12/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseResponse {
    private String message;
    private ResultCode code = ResultCode.SUCCESS;

    public boolean isSuccess() {
        return code == ResultCode.SUCCESS;
    }
}
