package com.controller;

import com.CommentVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by txw on 16/2/28.
 */
@RestController
public class TestJsonController {
    @RequestMapping(value = "/api/comments")
    public Object getComments(){
        List commentList=new ArrayList();
        CommentVo comment1=new CommentVo("138853440000","Pete Hunt","Hey there");
        CommentVo comment2=new CommentVo("138853440001","Pete Hunt2","Hey there2");
        commentList.add(comment1);
        commentList.add(comment2);
        return commentList;
    }
}
