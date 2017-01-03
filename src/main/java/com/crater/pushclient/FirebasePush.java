package com.crater.pushclient;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 * @author Greesh Kumar
 *
 */
@JsonInclude(Include.NON_NULL)
public class FirebasePush {
	
	private final String to;
	private final String[] registrationIds;
	private final String collapseKey;
	private final String priority;
	private final Boolean contentAvailable;
	private final Long timeTolive;
	private final Map<String,String> data;
	private final NotificationPayload notification;
	
	@SuppressWarnings("unused")
	private FirebasePush(){
		this(null, null, null, null, null, null, null, null);
	}
	
	public FirebasePush(final String to, final String[] registrationIds, final String collapseKey,
			final String priority, final Boolean contentAvailable, final Long timeTolive,
			final Map<String,String> data, final NotificationPayload notification) {
		this.to = to;
		this.registrationIds = registrationIds;
		this.collapseKey = collapseKey;
		this.priority = priority;
		this.contentAvailable = contentAvailable;
		this.timeTolive = timeTolive;
		this.data = data;
		this.notification = notification;
	}

	@JsonProperty("to")
	public String getTo() {
		return to;
	}

	@JsonProperty("registration_ids")
	public String[] getRegistrationIds() {
		return registrationIds;
	}

	@JsonProperty("collapse_key")
	public String getCollapseKey() {
		return collapseKey;
	}

	@JsonProperty("priority")
	public String getPriority() {
		return priority;
	}

	@JsonProperty("content_available")
	public Boolean getContentAvailable() {
		return contentAvailable;
	}

	@JsonProperty("time_to_live")
	public Long getTimeTolive() {
		return timeTolive;
	}

	@JsonProperty("data")
	public Map<String, String> getData() {
		return data;
	}

	@JsonProperty("notification")
	public NotificationPayload getNotificationPayload() {
		return notification;
	}

}
