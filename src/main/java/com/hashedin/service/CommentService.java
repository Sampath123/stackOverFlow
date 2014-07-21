package com.hashedin.service;

import java.util.Date;
import java.util.List;

import com.hashedin.model.ActiveUser;
import com.hashedin.model.Comment;
import com.hashedin.model.CommentsCountOverTime;
import com.hashedin.model.ReputationClass;

public interface CommentService {

	Comment find(Long commentId);

	List<Comment> findAll();

	Comment save(Comment comment);

	Comment update(Comment comment, Long commentId);

	Comment delete(Long commentId);
	
	List<CommentsCountOverTime> getNoOfComments(Date startDate,Date endDate);
	
	List<CommentsCountOverTime> getNoOfCommentsAll();
	
	List<CommentsCountOverTime> getNoOfEditedComments();
	
	List<ActiveUser> getTopUserCommentCounts();
	
	List<ReputationClass> getCorrelation();
	
	
	
}
