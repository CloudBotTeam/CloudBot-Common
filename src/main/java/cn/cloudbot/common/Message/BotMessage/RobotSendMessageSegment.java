package cn.cloudbot.common.Message.BotMessage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RobotSendMessageSegment implements Serializable {
//    消息的类型
    private MessageSegmentType type;

    private RobotSMSData data;
}
