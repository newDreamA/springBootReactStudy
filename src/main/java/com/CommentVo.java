package com;

/**
 * Created by txw on 16/2/28.
 */
public class CommentVo {
    private String id;
    private String author;
    private String text;

    public CommentVo() {
    }

    public CommentVo(String id, String author, String text) {

        this.id = id;
        this.author = author;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

