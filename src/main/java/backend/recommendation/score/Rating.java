package backend.recommendation.score;


import backend.user.User;
import javafx.util.Pair;

import javax.persistence.*;

@MappedSuperclass
public class Rating {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;

    @Column(name = "rating")
    private double rating;

    @Column(name = "favorite")
    private boolean isFavorite = false;

    public Rating() {
    }

    public Pair<Integer, String> getUser() {
        return new Pair<>(this.user.getId(), this.user.getName());
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

}
