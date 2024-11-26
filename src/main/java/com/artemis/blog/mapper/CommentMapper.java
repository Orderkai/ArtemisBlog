package com.artemis.blog.mapper;

import com.artemis.blog.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    int insertComment(Comment comment);

    List<Comment> findCommentsByBlogId(Integer blogId);

    int deleteCommentById(Integer id);
}