package org.palak.code.basen.services;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.UriInfo;

import org.palak.code.basen.Database.DatabaseClass;
import org.palak.code.basen.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L, new Message(1, "message1"));
	}

	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessageById(Long id)
	{
		return messages.get(id);
	}
	
	public Message createMessage(Message m)		//always process the entity with unique id, hence implementation of method 1 getId
	{
			m.setMessageId(messages.size()+1);
			messages.put(m.getMessageId(), m);
			return m;
	}
	public Map getData(Long id) // implementation of method 3 getData
	{
		Map<Long, String> map = new HashMap<>(); 
		List<Message> list=new ArrayList<>(messages.values());
		for (Message m : list) { 
			map.put(m.getMessageId(), m.getMessage());
		}
		return map;
	}
}