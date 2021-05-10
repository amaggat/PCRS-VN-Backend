package backend.security.model;


public class AuthenticationResponse {

    private final String jwt;
    private String username;
    private Integer id;
    private Boolean success;

    public AuthenticationResponse(String jwt, String username, Integer id) {
        this.jwt = jwt;
        this.username = username;
        this.id = id;
        this.success = true;
    }

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
        this.success = false;
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

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
