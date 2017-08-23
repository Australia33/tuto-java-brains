package spring.drx.starter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired 
	private TopicRepository topicRepo;	
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();		
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(long id) {
		return topicRepo.findOne(id);
	}	
	
	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}
	
	public void updateTopic(Topic topic) {
		topicRepo.save(topic);
	}
	
	public void deleteTopic(long id) {
		topicRepo.delete(id);
	}
	
}
