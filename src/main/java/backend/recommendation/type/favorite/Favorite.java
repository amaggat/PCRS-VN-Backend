package backend.recommendation.type.favorite;

import backend.user.User;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Favorite {

    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;
}
