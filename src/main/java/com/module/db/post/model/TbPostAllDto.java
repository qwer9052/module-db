package com.module.db.post.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.module.db.common.enums.Del;
import com.module.db.post.enums.PostType;
import com.module.db.user.model.TbUserDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TbPostAllDto {

    private Long postId;
    private TbUserDto tbUser;
    private String title;
    private String content;
    private PostType postType;
    private Del del;
    private LocalDateTime creDt;
    private LocalDateTime updDt;


}
