package com.module.db.post.model;

import com.module.db.common.enums.Del;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TbCommentChildrenDto {

    private Long commentId;
    private Long userId;
    private Del del;

    private String content;

    private Long parentId;

    private LocalDateTime creDt;
    private LocalDateTime updDt;

}
