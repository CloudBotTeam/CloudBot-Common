package cn.cloudbot.common.Message2;

import cn.cloudbot.common.Message.BotMessage.RobotSendMessage;
import lombok.*;

import java.util.Collection;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RobotSendMessage2 {
    private RobotSendMessage robotSendMessage;

    private Collection<String> services;
    private String robotIp;


}
