package com.spring.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.model.Topic;
import com.spring.app.service.TopicSerivice;

@RestController
@RequestMapping("/api")
public class TopicController {

	@Autowired
	private TopicSerivice topicService;
	

	// Api to get all topics
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopics();
	} 
	
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable Long id) {
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topic")
	public Topic addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
}
