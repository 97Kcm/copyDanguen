package com.dangeun.dto;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomUserDTO{
    private String id;
    private String name;
    private String email;
    private String nickname;
    private String profileImageUrl;

}
