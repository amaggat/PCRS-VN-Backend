package backend.user;


import backend.article.Post;
import backend.pcprofile.PcProfile;
import backend.model.NameEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "backend.user")
public class User extends NameEntity {

    @Column(name = "username")
    private String username = new String();

    @Column(name = "password")
    private String password = new String();

    @Column(name = "mail")
    private String gmail = new String();

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "backend/user")
    private List<PcProfile> pcProfile;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "backend/user")
    private List<Post> posts;

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

//    public List<Feedbacks> getFeedbacks() {
//        return backend.feedbacks;
//    }
//
//    public void setFeedbacks(List<Feedbacks> backend.feedbacks) {
//        this.backend.feedbacks = backend.feedbacks;
//    }

    public List<PcProfile> getPcProfile() {
        return pcProfile;
    }

    public void setPcProfile(List<PcProfile> pcProfile) {
        this.pcProfile = pcProfile;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
