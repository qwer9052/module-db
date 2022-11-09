package com.module.db.post.entity;


import com.module.db.base.BaseEntity;
import com.module.db.user.entity.TbUser;
import com.module.db.post.enums.PostType;
import com.module.db.common.enums.Del;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicInsert
@Builder(builderMethodName = "TbPostBuilder")
public class TbPost extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "LONGTEXT", nullable = false)
    private String content;

    @Column(columnDefinition = "TINYINT")
    @ColumnDefault("'0'")
    private PostType postType;

    @Column(columnDefinition = "TINYINT", nullable = false)
    @ColumnDefault("'0'")
    @Builder.Default
    private Del del = Del.N;

    @OneToMany(mappedBy = "tbPost", cascade = CascadeType.ALL)
    List<TbPostLike> postLikes;

    @OneToMany(mappedBy = "tbPost", fetch = FetchType.LAZY, orphanRemoval = true)
    private List<TbComment> comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private TbUser tbUser;


}
