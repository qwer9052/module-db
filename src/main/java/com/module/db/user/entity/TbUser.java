package com.module.db.user.entity;


import com.module.db.base.BaseEntity;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder(builderMethodName = "TbUserBuilder")
public class TbUser extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String pwd, email, name;




}
