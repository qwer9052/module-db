package com.module.db.post.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.module.db.common.enums.Del;
import com.module.db.post.enums.PostType;
import com.module.db.user.model.TbUserDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TbPostDto {

    private Long postId;
    private TbUserDto user;
    private String title;
    private String content;
    private PostType postType;
    private Del del;
    private LocalDateTime creDt;
    private LocalDateTime updDt;
}
