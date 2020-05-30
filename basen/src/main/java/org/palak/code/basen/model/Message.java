package org.palak.code.basen.model;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlTransient;

public class Message {
	private long messageId;
	private String message;

	private static Map<Long, Comment> comments=new HashMap<>();
	
	public Message()
	{
		
	}
	public Message(long messageId, String message) {
		super();
		this.messageId = messageId;
		this.message = message;
	}
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}
	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
}
