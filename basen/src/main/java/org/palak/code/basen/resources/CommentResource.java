package org.palak.code.basen.resources;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.palak.code.basen.model.Comment;
import org.palak.code.basen.services.CommentService;


@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CommentResource {

CommentService cs = new CommentService();
	
@GET
public List<Comment> getAllComments(@PathParam("messageId") long messageId)
{
	return cs.getAllComments(messageId);
}

@GET
@Path("/{commentId}")
public Comment getComment(@PathParam("messageId") long messageId, @PathParam("commentId")long commentId)
{
	return cs.getComment(messageId, commentId);
}

@POST
public Comment addComment(@PathParam("messageId") long messageId, Comment comment)
{
	return cs.addComment(messageId, comment);
}
}