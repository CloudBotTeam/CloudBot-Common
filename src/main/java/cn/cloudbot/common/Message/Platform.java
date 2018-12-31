package cn.cloudbot.common.Message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public enum Platform implements Serializable {
    @JsonProperty("qq")
    QQ,
    @JsonProperty("wechat")
    WECHAT;

    @JsonCreator
    public static Platform forValue(String value) {
        value = value.trim().toLowerCase();
        if (value.equals("qq")) {
            return Platform.QQ;
        } else if (value.equals("wechat")) {
            return Platform.WECHAT;
        } else {
            throw new RuntimeException("Type for platform error");
        }
    }
}
