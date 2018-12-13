package cn.cloudbot.common.Message.BotMessage;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消息的具体内容
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RobotSMSData {
    private String text;

    private String url;

    private String file;

    private String face;

    private String qq;
}
