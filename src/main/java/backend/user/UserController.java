package backend.user;

import backend.security.model.AuthenticationRequest;
import backend.security.model.AuthenticationResponse;
import backend.security.service.UserDetailService;
import backend.security.utils.JwtUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtTokenUtil;

    @Autowired
    private UserDetailService userDetailService;

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(
            @RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (Exception e) {
            return ResponseEntity.ok(new AuthenticationResponse("Incorrect username or password"));
        }

        final UserDetails userDetails = userDetailService
                .loadUserByUsername(authenticationRequest.getUsername());
        User userInfo = userRepository.findUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt, userInfo.getUsername(), userInfo.getId()));
    }

    @PostMapping("/api/register")
    public ResponseEntity<?> register(@RequestBody User user) throws Exception {
        if(userRepository.findUserByUsername(user.getUsername()) != null) {
            return ResponseEntity.ok(new AuthenticationResponse("Already use"));
        }
        userRepository.save(user);
        return ResponseEntity.ok(new AuthenticationResponse("Registered", user.getUsername()));
    }

    @GetMapping("/api/user/{UserID}")
    public User findByID(@PathVariable("UserID") Integer id) {
        User user = userRepository.findByID(id);
        user.setPassword(null);
        return user;
    }

}
