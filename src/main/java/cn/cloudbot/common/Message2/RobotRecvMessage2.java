package cn.cloudbot.common.Message2;

import cn.cloudbot.common.Message.Platform;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RobotRecvMessage2 {
    // type is "all" or "return"
    private String type;

    private String message;

    // if type is "all"
    private String from_service;    // 来自的服务

    // if type is "return"
    private String robot_ip;

    private String group_id;

    private Platform platform;
}
