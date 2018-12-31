package cn.cloudbot.common.Message.ServiceMessage;

import cn.cloudbot.common.Message.Platform;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RobotRecvMessage implements Serializable {
    private String robot_name;

    private String group_id;

    private String room_id;

    private String message;


    private Platform platform;

}
