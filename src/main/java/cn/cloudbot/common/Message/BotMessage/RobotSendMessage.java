package cn.cloudbot.common.Message.BotMessage;

import cn.cloudbot.common.Message.Platform;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class RobotSendMessage implements Serializable {
//    QQ or wechat 平台
    private Platform platform;

    private RobotSendMessageSegment[] message;

    private String robot_name;

    private RobotMessageSender sender;

}
