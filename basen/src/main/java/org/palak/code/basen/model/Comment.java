package org.palak.code.basen.model;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Comment {
	private long id;
	private String author;
	private String comment;
	
	public Comment()
	{
		
	}
	
	public Comment(long id, String author, String comment) {
		super();
		this.id = id;
		this.author = author;
		this.comment = comment;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}