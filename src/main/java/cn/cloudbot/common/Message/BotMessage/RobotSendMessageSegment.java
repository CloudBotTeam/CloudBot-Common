package cn.cloudbot.common.Message.BotMessage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RobotSendMessageSegment {
//    消息的类型
    private MessageSegmentType type;

    private RobotSMSData data;
}
