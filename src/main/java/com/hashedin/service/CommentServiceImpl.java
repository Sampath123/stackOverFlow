package com.hashedin.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hashedin.model.ActiveUser;
import com.hashedin.model.Comment;
import com.hashedin.model.CommentsCountOverTime;
import com.hashedin.model.ReputationClass;
import com.hashedin.repository.CommentRepository;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	public Comment find(Long commentId) {
		// Returns the Comment for given commentId.
		return commentRepository.find(commentId);
	}

	@Transactional
	public Comment save(Comment comment) {
		// Saves the given comment object and returns the same.
		commentRepository.save(comment);
		return comment;
	}

	@Override
	public List<Comment> findAll() {
		// Returns all the comments in our system.
		return commentRepository.findAll();
	}

	@Override
	public Comment update(Comment comment, Long commentId) {
		// Updates the comment with the given commentId;
		return null;
	}

	@Transactional
	public Comment delete(Long commentId) {
		// Deletes the comment with the give commentId and returns the same.
		return commentRepository.delete(commentId);
	}

	@Override
	public List<CommentsCountOverTime> getNoOfComments(Date startDate,Date endDate) {
		// TODO Auto-generated method stub
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + commentRepository.getNoOfComments(startDate,endDate));
		return commentRepository.getNoOfComments(startDate,endDate);
	}

	@Override
	public List<CommentsCountOverTime> getNoOfEditedComments() {
		// TODO Auto-generated method stub
		return commentRepository.getNoOfEditedComments();
	}

	@Override
	public List<ActiveUser> getTopUserCommentCounts() {
		return commentRepository.getTopActiveUserss();
	}

	@Override
	public List<ReputationClass> getCorrelation() {
		return commentRepository.getCorrelation();
	}

	@Override
	public List<CommentsCountOverTime> getNoOfCommentsAll() {
		return commentRepository.getNoOfCommentsAll();
	}
}
