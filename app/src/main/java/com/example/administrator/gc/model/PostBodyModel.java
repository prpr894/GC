package com.example.administrator.gc.model;

import com.example.administrator.gc.base.BaseModel;

import java.util.List;

/**
 * Created by Administrator on 2016/4/11.
 */
public class PostBodyModel extends BaseModel {

    private PostDetailHeaderModel header;

    private List<PostDetailModel> commentList;

    public PostDetailHeaderModel getHeader() {
        return header;
    }

    public void setHeader(PostDetailHeaderModel header) {
        this.header = header;
    }

    public List<PostDetailModel> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<PostDetailModel> commentList) {
        this.commentList = commentList;
    }
}