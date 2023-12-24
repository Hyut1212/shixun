package com.example.demo.mapper;

import com.example.demo.enity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
    @Mapper
    public interface CommentMapper {
        @Insert("insert into comment (course_id, content,user_id,user_name) VALUES (#{courseId},#{content},#{userId},#{userName})")
        int insertComment(Comment comment);
    @Select("SELECT * FROM comment WHERE course_id = #{courseId}")
    List<Comment> getCommentsByCourseId(@Param("courseId") Long courseId);
    }

