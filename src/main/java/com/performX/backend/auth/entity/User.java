package com.performX.backend.auth.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Objects;

@Setter
@Getter
public class User {
    private String id;
    private String username;
    private String password;
    private String[] roles;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.deepEquals(roles, user.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, Arrays.hashCode(roles));
    }
}
