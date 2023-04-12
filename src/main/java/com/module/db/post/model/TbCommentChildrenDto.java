package com.module.db.post.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.module.db.common.enums.Del;
import com.module.db.user.model.TbUserDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TbCommentChildrenDto implements Serializable {

    private Long commentId;
    private TbUserDto tbUser;
    private Del del;

    private String content;

    private Long parentId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime creDt;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    private LocalDateTime updDt;

    private Long countCommentChildrenLike;
    private boolean like = false;

}
