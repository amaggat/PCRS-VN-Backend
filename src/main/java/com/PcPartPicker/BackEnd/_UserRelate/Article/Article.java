package com.PcPartPicker.BackEnd._UserRelate.Article;


import com.PcPartPicker.BackEnd._Model.PcProfile;
import com.PcPartPicker.BackEnd._UserRelate.Feedbacks.Feedbacks;
import com.PcPartPicker.BackEnd._UserRelate.NameEntity;
import com.PcPartPicker.BackEnd._UserRelate.User.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "post")
public class Article extends NameEntity {

    @Column(name = "creationtime")
    @NotEmpty
    private Date creationTime;

    @Column(name = "details")
    @NotEmpty
    private String details = new String();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userid")
    private User user;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "article")
    private List<Feedbacks> feedbacks;

    @OneToOne
    @JoinTable(
            name = "post_pc",
            joinColumns = @JoinColumn(name = "PostID"),
            inverseJoinColumns = @JoinColumn(name = "PcID")
    )

    private PcProfile pcProfile;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
}
