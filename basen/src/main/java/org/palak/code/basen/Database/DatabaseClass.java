package org.palak.code.basen.Database;

import java.util.HashMap;
import java.util.Map;
import org.palak.code.basen.model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	public static Map<Long, Message> getMessages()
	{
		return messages;
	}
}