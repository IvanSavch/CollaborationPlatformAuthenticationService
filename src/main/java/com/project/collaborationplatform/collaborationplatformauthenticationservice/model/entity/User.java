package com.project.collaborationplatform.collaborationplatformauthenticationservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "users_credentials")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Role role;
    private boolean active;

    public enum Role implements GrantedAuthority {
        ADMIN_ROLE, USER_ROLE;

        @Override
        public @Nullable String getAuthority() {
            return null;
        }
    }
}
