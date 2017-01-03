package com.crater.pushclient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alonegk.pushclient.PushService;
import com.alonegk.pushclient.firebase.FirebasePush;
import com.alonegk.pushclient.firebase.NotificationPayload;

public class Test {

    public static final String API_KEY = "API_KEY";

    public static void main(String[] args) {
    	
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
    			new String[] { "push-client-config.xml" });
    	
    	PushService pushService = (PushService) context.getBean("pushService");
    	
		NotificationPayload notification = NotificationPayload.withTitleAndBody("WEDO", "Helloo");
		
		FirebasePush push = new FirebasePush("dzAJjmD5uKg:APA91bEa6Rv7LahWq3-4LaYa05Fm99Da8uuWGvzrOHpjEyMV9dX4"
				+ "9Ay7ATyMt3At2ggRnGv8ImxInb-ieQ4RkMz_CjlCD7AwbDURHS8uojrUyi__"
				+ "l6S4_rfR1ioPLQi0aaP0zJT3rF5X", null, null, null, null, null, null, notification);
		
		pushService.sendPushNotification(push);
    	
    }

}