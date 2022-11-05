package com.module.db.post.entity;

import com.module.db.base.BaseEntity;
import com.module.db.user.entity.TbUser;
import com.module.db.common.enums.Del;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@DynamicInsert
@Builder(builderMethodName = "TbBoardLikeBuilder")
public class TbPostLike extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postLikeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private TbUser tbUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId")
    private TbPost tbPost;

    @Column(columnDefinition = "TINYINT")
    @ColumnDefault("'0'")
    private Del del;

}
