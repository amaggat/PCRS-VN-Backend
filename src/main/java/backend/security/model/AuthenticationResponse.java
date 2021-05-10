package backend.security.model;

import javax.persistence.criteria.CriteriaBuilder;

public class AuthenticationResponse {

    private final String jwt;
    private String username;
    private Integer id;

    public AuthenticationResponse(String jwt, String username, Integer id) {
        this.jwt = jwt;
        this.username = username;
        this.id = id;
    }

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
