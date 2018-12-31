import cn.cloudbot.common.Message.BotMessage.RobotSendMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;


public class TestConvert {
    private static final String JSON_DATA = "{\"raw_message\":\"你妈呀\",\"sender\":{\"age\":20,\"nickname\":\"风空之枫\",\"sex\":\"male\",\"user_id\":1506118561},\"sub_type\":\"friend\",\"user_id\":1506118561,\"self_id\":3187545268,\"message_id\":871,\"message_type\":\"private\",\"post_type\":\"message\",\"time\":1546271324,\"message\":[{\"data\":{\"text\":\"你妈呀\"},\"type\":\"text\"}],\"font\":34094184}";

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void TestRobotConvert() throws Exception {
        RobotSendMessage data = objectMapper.readValue(JSON_DATA, RobotSendMessage.class);
        System.out.println(data.getMessage());

        System.out.println(data);
    }

    @Before
    public void setUp() throws Exception {

    }
}
