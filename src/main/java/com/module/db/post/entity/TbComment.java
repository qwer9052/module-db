package com.module.db.post.entity;

import com.module.db.base.BaseEntity;
import com.module.db.user.entity.TbUser;
import com.module.db.common.enums.Del;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DynamicInsert
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
public class TbComment extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    private String content;

    @Column(columnDefinition = "TINYINT")
    @ColumnDefault("'0'")
    private Del del;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private TbUser tbUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "postId")
    private TbPost tbPost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "commentId")
    private TbComment parent;

    @Builder.Default
    @OneToMany(mappedBy = "parent")
    private List<TbComment> children = new ArrayList<>();

}
