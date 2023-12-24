package com.example.demo.service;

import com.example.demo.dto.CommentDTO;
import com.example.demo.enity.Comment;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
    public interface CommentService {
        boolean addComment(CommentDTO commentDTO);
        List<Comment> getCommentsByCourseId(Long courseId);
    }

