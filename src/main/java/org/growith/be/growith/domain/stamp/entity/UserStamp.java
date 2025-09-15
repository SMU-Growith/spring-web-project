package org.growith.be.growith.domain.stamp.entity;

import jakarta.persistence.*;
import lombok.*;
import org.growith.be.growith.global.common.BaseEntity;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "user_stamp")
public class UserStamp extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "user_stamp_id")
    private Long id;




}
