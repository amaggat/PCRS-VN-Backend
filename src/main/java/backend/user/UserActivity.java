package backend.user;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_activity")
public class UserActivity {

    @Id
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    private User user;

    @Column(name = "action")
    private String action;

    @Column(name = "componentid")
    private String componentId;

    public UserActivity(User user, String action, String componentId) {
        this.id = user.getId() + "-" + componentId;
        this.user = user;
        this.action = action;
        this.componentId = componentId;
    }

    public UserActivity() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

}
