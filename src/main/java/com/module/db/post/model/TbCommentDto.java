package com.module.db.post.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.module.db.common.enums.Del;
import com.module.db.user.model.TbUserDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class TbCommentDto implements Serializable {

    private Long commentId;
    private TbUserDto tbUser;
    private Del del;
    private String content;
    private Long parentId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime creDt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime updDt;
    private List<TbCommentChildrenDto> children;

    private boolean like = false;
    private Long countCommentLike;

}
