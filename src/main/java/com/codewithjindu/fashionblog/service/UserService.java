package com.codewithjindu.fashionblog.service;

import com.codewithjindu.fashionblog.dto.CommentRequestPayload;
import com.codewithjindu.fashionblog.exception.NotAuthorizedException;
import com.codewithjindu.fashionblog.exception.ResourceNotFoundException;
import com.codewithjindu.fashionblog.model.Comment;

import java.util.List;

public interface UserService {
    String editComment(CommentRequestPayload commentRequestPayload, Long commentId) throws NotAuthorizedException, ResourceNotFoundException;
    String likePost(Long postId) throws ResourceNotFoundException;
    String createComment(CommentRequestPayload commentRequestPayload, Long postId) throws ResourceNotFoundException;
    List<Comment> viewAllComments (Long postId) throws ResourceNotFoundException;

}
