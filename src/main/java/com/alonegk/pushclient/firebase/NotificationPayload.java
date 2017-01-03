package com.alonegk.pushclient.firebase;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * 
 * @author Greesh Kumar
 *
 */
@JsonInclude(Include.NON_NULL)
public class NotificationPayload {
	
	//common
	private final String title;
	private final String body;
	private final String sound;
	private final String clickAction;
	private final String bodyLocKey;
	private final String[] bodyLocArgs;
	private final String titleLocKey;
	private final String[] titleLocArgs;
	
	// IOS specific
	private final String badge;
	
	// Android specific
	private final String icon;
	private final String tag;
	private final String color;
	
	@SuppressWarnings("unused")
	private NotificationPayload() {
		this(null, null, null, null, null, null, null, null, null, null, null, null);
	}
	
	public NotificationPayload(final String title, final String body, final String sound, final String clickAction, final String bodyLocKey,
			final String[] bodyLocArgs, final String titleLocKey, final String[] titleLocArgs, final String badge, final String icon,
			final String tag, final String color) {
		super();
		this.title = title;
		this.body = body;
		this.sound = sound;
		this.clickAction = clickAction;
		this.bodyLocKey = bodyLocKey;
		this.bodyLocArgs = bodyLocArgs;
		this.titleLocKey = titleLocKey;
		this.titleLocArgs = titleLocArgs;
		this.badge = badge;
		this.icon = icon;
		this.tag = tag;
		this.color = color;
	}
	
	public static NotificationPayload withTitleAndBody(final String title, final String body) {
		return new NotificationPayload(title, body, null, null, null, null, null,
				null, null, null, null, null);
	}
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}
	@JsonProperty("body")
	public String getBody() {
		return body;
	}
	@JsonProperty("sound")
	public String getSound() {
		return sound;
	}
	@JsonProperty("click_action")
	public String getClickAction() {
		return clickAction;
	}
	@JsonProperty("body_loc_key")
	public String getBodyLocKey() {
		return bodyLocKey;
	}
	@JsonProperty("body_loc_args")
	public String[] getBodyLocArgs() {
		return bodyLocArgs;
	}
	@JsonProperty("title_loc_key")
	public String getTitleLocKey() {
		return titleLocKey;
	}
	@JsonProperty("title_loc_args")
	public String[] getTitleLocArgs() {
		return titleLocArgs;
	}
	@JsonProperty("badge")
	public String getBadge() {
		return badge;
	}
	@JsonProperty("icon")
	public String getIcon() {
		return icon;
	}
	@JsonProperty("tag")
	public String getTag() {
		return tag;
	}
	@JsonProperty("color")
	public String getColor() {
		return color;
	}
	
}
