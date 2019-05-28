package starter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("spring","Spring Framework", "Spring Framework Description"),
                new Topic("java","Core Java", "Core JavaDescription"),
                new Topic("selenium","SELENIUM Framework", "Selenium Framework Description")
        ));

    public  List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String ID){
       return topics.stream().filter(t->t.getID().equals(ID)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }


    public void updateTopic(Topic topic, String ID) {
        for(int i=0; i< topics.size();i++){
            if(topics.get(i).getID().equals(ID)){
                topics.set(i,topic);
                return;
            }
        }

    }

    public void deleteTopic(String ID) {
        topics.removeIf(t->t.getID().equals(ID));
    }
}
