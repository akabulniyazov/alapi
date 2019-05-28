package starter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicCopntroller {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{ID}")
    public Topic getTopic(@PathVariable String ID){
        return topicService.getTopic(ID);
    }

    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/topics/{ID}")
    public void updateTopic(@RequestBody Topic topic,@PathVariable String ID){
        topicService.updateTopic(topic,ID);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/topics/{ID}")
    public void deleteTopic(@PathVariable String ID){
        topicService.deleteTopic(ID);
    }


}
