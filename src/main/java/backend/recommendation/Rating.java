package backend.recommendation;


import backend.user.User;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


public class Rating {

    private User user = new User();

    @Column(name = "rating")
    private double rating;

    public Rating() {
    }

    public Integer getUser() {
        return user.getId();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
