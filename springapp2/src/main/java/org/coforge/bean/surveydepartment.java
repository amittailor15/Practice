package org.coforge.bean;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class surveydepartment {

		 private int surveyDepartmentId;
		 private String surveyDepartmentLocation;
		 private int surveyDepartmentTeamSize;
	
		 @PostConstruct
		 private void init() {
			 this.surveyDepartmentId=455621;
			 this.surveyDepartmentLocation="noida";
			 this.surveyDepartmentTeamSize=10;
		 }

}
