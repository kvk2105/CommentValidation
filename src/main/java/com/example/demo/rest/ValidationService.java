package com.example.demo.rest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Constants;
import com.example.demo.model.Message;

@RestController
@RequestMapping("/product")
public class ValidationService {

	
	@GetMapping(value="/comment/validate",produces=MediaType.APPLICATION_JSON_VALUE)
	public Message validateComment(@RequestParam String comment){
		String commentFeedback="";
		Set<String> commentWords= new HashSet<>(Arrays.asList(comment.split(" ")));		
		commentWords.retainAll(Constants.OBJECTIONABLE_WORDS);
		if(commentWords.size()>0){
			Iterator<String> unwantedWordsIterator=commentWords.iterator();
			commentFeedback="Your comment contains few objectionable words like "+ unwantedWordsIterator.next() + " and it can't be posted.";
		}else{
			commentFeedback="Your comment passes our moderation criteria and will appear in comments";
		}
		return new Message(commentFeedback);
	}
}
