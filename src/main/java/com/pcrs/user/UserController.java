package com.pcrs.user;

import com.pcrs.security.utils.JwtUtils;
import com.pcrs.security.service.UserDetailService;
import com.pcrs.security.model.AuthenticationRequest;
import com.pcrs.security.model.AuthenticationResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(
            @RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            logger.log(org.apache.logging.log4j.Level.forName("CLIENT", 90), authenticationRequest.getUsername() + " " + authenticationRequest.getPassword());
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getPassword(),
                            authenticationRequest.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }

        final UserDetails userDetails = userDetailService
                .loadUserByUsername(authenticationRequest.getUsername());

        logger.log(org.apache.logging.log4j.Level.forName("CLIENT", 90), userDetails.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        logger.log(org.apache.logging.log4j.Level.forName("CLIENT", 90), jwt);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }

}