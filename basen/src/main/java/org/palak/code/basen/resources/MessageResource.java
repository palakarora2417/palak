package org.palak.code.basen.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.palak.code.basen.model.Message;
import org.palak.code.basen.services.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

MessageService messageService = new MessageService();
	
@GET
public List<Message> getAllMessages()
{
	return messageService.getAllMessages();
}

@GET
@Path("/{messageId}")
public Message getMessageById(@PathParam("messageId") Long id)
{
	return messageService.getMessageById(id);
}

@POST
public Response createMessage(Message m,@Context UriInfo u) throws URISyntaxException{
	Message newMessage= messageService.createMessage(m);
	String newId=String.valueOf(newMessage.getMessageId());
	URI uri= u.getAbsolutePathBuilder().path(newId).build();
	return Response.created(uri).entity(newMessage).build();
	//return messageService.createMessage(m);
}

@Path("/{messageId}/comments")
public CommentResource test()
{
	return new CommentResource();
}
}