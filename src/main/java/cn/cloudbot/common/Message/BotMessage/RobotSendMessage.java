package cn.cloudbot.common.Message.BotMessage;

import cn.cloudbot.common.Message.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RobotSendMessage {
//    QQ or wechat 平台
    private Platform platform;

    private RobotSendMessageSegment[] data;

    private String robot_name;

}
