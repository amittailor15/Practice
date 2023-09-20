package org.coforge.model;

import org.coforge.bean.survey;
import org.coforge.bean.surveydepartment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class surveymain {

	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		 survey sv = context.getBean(survey.class);
		 System.out.println(sv);
		 System.out.println(sv.getSurveyId());
		 System.out.println(sv.getSurveyName());
		 System.out.println(sv.getSurveyLocation());
		 
		 System.out.println(sv.getSurveydepartment().getSurveyDepartmentId());
		 surveydepartment sd=sv.getSurveydepartment();
		 System.out.println(sd.getSurveyDepartmentLocation());
		 System.out.println(sd.getSurveyDepartmentTeamSize());
	}

}
