package org.coforge.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class survey {
	 private int surveyId;
	 private String surveyName;
	 private String surveyLocation;
	 @Autowired
	 surveydepartment surveydepartment;
	
	 @PostConstruct
	 public void startup() {
		 this.surveyId=456152;
		 this.surveyName="education";
		 this.surveyLocation="delhi";
		 System.out.println("init called...");
	 }
	
	 @PreDestroy
	 public void cleanup() {
	     System.out.println("clean up called");
	 }
	
}
	
