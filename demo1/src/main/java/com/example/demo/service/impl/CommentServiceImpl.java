package com.example.demo.service.impl;

import com.example.demo.dto.CommentDTO;
import com.example.demo.enity.Comment;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public class CommentServiceImpl implements CommentService {
        @Autowired
        private CommentMapper commentMapper;

        @Override
        public boolean addComment(CommentDTO commentDTO) {
            Comment comment = new Comment();
            comment.setUserId(commentDTO.getUserId());
            comment.setContent(commentDTO.getContent());
            comment.setCourseId(commentDTO.getCourseId());
            comment.setUserName(commentDTO.getUserName());



            int result = commentMapper.insertComment(comment);
            return result > 0;
        }
    @Override
    public List<Comment> getCommentsByCourseId(Long courseId) {
        return commentMapper.getCommentsByCourseId(courseId);
    }
    }

