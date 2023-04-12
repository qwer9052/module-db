package com.module.db.post.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import com.module.db.common.enums.Del;
import com.module.db.post.enums.PostType;
import com.module.db.user.model.TbUserDto;
import com.querydsl.core.types.dsl.NumberPath;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TbPostDto implements Serializable {

    private Long postId;
    private TbUserDto tbUser;
    private String title;
    private String content;

    private PostType postType;
    private Del del;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime creDt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime updDt;
    private List<TbCommentDto> comments;

    private Long countHistory;
    private Long countPostLike;
    private boolean like = false;



}
