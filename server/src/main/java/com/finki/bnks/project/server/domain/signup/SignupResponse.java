package com.finki.bnks.project.server.domain.signup;

public class SignupResponse {
    private final SignupStatus status;
    private final String username;
    private final String secret;

    public SignupResponse(SignupStatus status) {
        this(status, null, null);
    }

    public SignupResponse(SignupStatus status, String username, String secret) {
        this.status = status;
        this.username = username;
        this.secret = secret;
    }

    public SignupStatus getStatus() {
        return status;
    }

    public String getUsername() {
        return username;
    }

    public String getSecret() {
        return secret;
    }
}
