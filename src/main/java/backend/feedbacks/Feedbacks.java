package backend.feedbacks;

import backend.article.Post;
import backend.model.NameEntity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "backend.feedbacks")
public class Feedbacks extends NameEntity {

    @Column(name = "details")
    @NotEmpty
    private String details;

    @Column(name = "creationtime")
    @NotEmpty
    private String creationtime;

//    @Column(name = "email")
//    @NotEmpty
//    private String email = new String();

//    @ManyToOne
//    @JoinColumn(name = "creatorid")
//    private User backend.user;

    @ManyToOne(optional=false)
    @JoinColumn(name = "postid")
    private Post post;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

    //    public User getUser() {
//        return backend.user;
//    }

//    public void setUser(User backend.user) {
//        this.backend.user = backend.user;
//    }

    public Integer getPost() {
        return post.getId();
    }

    public void setPost(Post post) {
        this.post = post;
    }


}
