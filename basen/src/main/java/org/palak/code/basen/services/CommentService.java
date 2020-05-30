package org.palak.code.basen.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.palak.code.basen.Database.DatabaseClass;
import org.palak.code.basen.model.Comment;
import org.palak.code.basen.model.Message;


public class CommentService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessages();
	
	public CommentService()
	{
		
	}
	
	public List<Comment> getAllComments(long messageId) // implemetation of method-2 getAllSubEnteries 
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());	
	}
	
	public Comment getComment(long messageId, long commentId)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		return comments.get(commentId);
	}
	
	public Comment addComment(long messageId, Comment comment)
	{
		Map<Long, Comment> comments=messages.get(messageId).getComments();
		comment.setId(comments.size()+1);
		comments.put(comment.getId(), comment);
		return comment;
	}
	
}