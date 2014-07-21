package com.hashedin.repository;

import java.util.List;

import com.hashedin.model.Comment;
import com.hashedin.model.CommentsCountOverTime;
import com.hashedin.model.ReputationClass;
import com.hashedin.model.TopUserCommentCount;

public interface CommentRepository {

	Comment find(Long commentId);

	List<Comment> findAll();

	Comment save(Comment comment);

	Comment update(Comment comment, Long commentId);

	Comment delete(Long commentId);

	List<CommentsCountOverTime> getNoOfComments();

	List<CommentsCountOverTime> getNoOfEditedComments();
	
	List<TopUserCommentCount> getTopActiveUserss();
	
	List<ReputationClass> getCorrelation();
	
	
	

}
