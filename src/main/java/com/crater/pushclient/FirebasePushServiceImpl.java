package com.crater.pushclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
/**
 * 
 * @author Greesh Kumar
 *
 */
@Service
public class FirebasePushServiceImpl implements PushService {

	private final Logger LOGGER = LoggerFactory.getLogger(FirebasePushServiceImpl.class);
	private final static String AUTHORIZATION = "Authorization";
	private final static String CONTENT_TYPE = "Content-Type";
	
	private final FirebaseConfig conf;
	private final RestTemplate restTemplate;
	
	@Autowired
	FirebasePushServiceImpl(final FirebaseConfig conf,final RestTemplate restTemplate){
		this.conf =conf;
		this.restTemplate = restTemplate;
	}
	
	public void sendPushNotification(final FirebasePush push) {
		final HttpHeaders headers = new HttpHeaders();
		headers.add(CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
		headers.add(AUTHORIZATION, conf.getServerKey());
		
		final HttpEntity<FirebasePush> requestEntity = new HttpEntity<FirebasePush>(push,headers);
		try{
			final ResponseEntity<String> res = restTemplate.exchange(conf.getBaseUrl(),
					HttpMethod.POST, requestEntity, String.class);
				LOGGER.info("Firebase Response: status: {}, {}",res.getStatusCode(),res.getBody());
		}catch(RestClientException e){
			LOGGER.debug("Firebase: Error while sending push ",e);
		}
	}
}
