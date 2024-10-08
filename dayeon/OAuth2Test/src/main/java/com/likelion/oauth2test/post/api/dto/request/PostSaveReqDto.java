package com.likelion.oauth2test.post.api.dto.request;

import com.likelion.oauth2test.post.domain.Post;
import com.likelion.oauth2test.user.domain.User;
import jakarta.validation.constraints.NotBlank;

public record PostSaveReqDto(
        String title,
        String content

) {
        public Post toEntity(User user, String image) {
                return Post.builder()
                        .title(title)
                        .content(content)
                        .image(image)
                        .user(user)
                        .build();
        }
}
