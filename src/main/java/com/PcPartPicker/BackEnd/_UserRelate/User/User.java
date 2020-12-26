package com.PcPartPicker.BackEnd._UserRelate.User;


import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._UserRelate.Article.Article;
import com.PcPartPicker.BackEnd._UserRelate.Feedbacks.Feedbacks;
import com.PcPartPicker.BackEnd._UserRelate.NameEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User extends NameEntity {

    @Column(name = "username")
    private String username = new String();

    @Column(name = "password")
    private String password = new String();

    @Column(name = "mail")
    private String gmail = new String();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Feedbacks> feedbacks;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<PcProfile> pcProfile;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
    private List<Article> articles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public List<Feedbacks> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedbacks> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<PcProfile> getPcProfile() {
        return pcProfile;
    }

    public void setPcProfile(List<PcProfile> pcProfile) {
        this.pcProfile = pcProfile;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
