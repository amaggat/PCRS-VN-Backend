package com.pcrs.article;


import com.pcrs.feedbacks.Feedbacks;
import com.pcrs.pcprofile.PcProfile;
import com.pcrs.model.NameEntity;
import com.pcrs.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "post")
public class Post extends NameEntity {

    @Column(name = "creationtime")
    @NotEmpty
    private Date creationTime;

    @Column(name = "details")
    @NotEmpty
    private String details = new String();

    @Column(name = "description")
    @NotEmpty
    private String description = new String();

    @Column(name = "price")
    @NotEmpty
    private String price = new String();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "creatorid")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
    private List<Feedbacks> feedbacks;

    @OneToOne
    @JoinTable(
            name = "post_pc",
            joinColumns = @JoinColumn(name = "PostID"),
            inverseJoinColumns = @JoinColumn(name = "PcID")
    )
    private PcProfile pcProfile;


//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

    public PcProfile getPcProfile() {
        return pcProfile;
    }

    public void setPcProfile(PcProfile pcProfile) {
        this.pcProfile = pcProfile;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Feedbacks> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedbacks> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
