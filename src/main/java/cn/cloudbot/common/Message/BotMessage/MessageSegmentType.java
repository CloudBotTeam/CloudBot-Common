package cn.cloudbot.common.Message.BotMessage;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

public enum  MessageSegmentType implements Serializable {

    @JsonProperty("text")
    TEXT,
    @JsonProperty("face")
    FACE,
    @JsonProperty("image")
    IMAGE,
    @JsonProperty("at")
    AT,
    @JsonProperty("qq")
    QQ,
    @JsonProperty("wechat_id")
    WECHAT_ID
}
