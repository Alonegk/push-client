package com.alonegk.pushclient.firebase;
/**
 * 
 * @author Greesh Kumar
 *
 */
public class FirebaseConfig {

	private final String baseUrl;
	private final String serverKey;
	private final Long senderId;

	public FirebaseConfig(final String baseUrl, final String serverKey, final Long senderId) {
		this.baseUrl = baseUrl;
		this.serverKey = serverKey;
		this.senderId = senderId;
	}
	
	public String getBaseUrl() {
		return baseUrl;
	}
	public String getServerKey() {
		return serverKey;
	}
	public Long getSenderId() {
		return senderId;
	}
}
