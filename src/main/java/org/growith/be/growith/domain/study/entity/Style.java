package org.growith.be.growith.domain.study.entity;

import jakarta.persistence.*;
import lombok.*;
import org.growith.be.growith.global.common.BaseEntity;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "style")
public class Style extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "style_id")
    private Long id;

    private String styleName;
}
