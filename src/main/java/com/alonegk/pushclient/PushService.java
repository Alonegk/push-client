package com.alonegk.pushclient;

import com.alonegk.pushclient.firebase.FirebasePush;

/**
 * 
 * @author Greesh Kumar
 *
 */
public interface PushService {
	
	void sendPushNotification(FirebasePush push);

}
