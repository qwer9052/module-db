package com.module.db.post.model;

import com.module.db.common.enums.Del;
import com.module.db.user.model.TbUserDto;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TbCommentDto {

    private Long commentId;
    private TbUserDto tbUser;
    private Del del;
    private String content;
    private Long parentId;

    private LocalDateTime creDt;
    private LocalDateTime updDt;
    private List<TbCommentChildrenDto> children;

}
