package org.growith.be.growith.domain.study.entity;


import jakarta.persistence.*;
import lombok.*;
import org.growith.be.growith.domain.study.entity.enums.ContactType;
import org.growith.be.growith.domain.study.entity.enums.StudyStatus;
import org.growith.be.growith.global.common.BaseEntity;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "study")
public class Study extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "study_id")
    private Long id;

    private String title;

    private String description;

    @Enumerated(EnumType.STRING)
    private StudyStatus studyStatus;

    @Enumerated(EnumType.STRING)
    private ContactType contactType;

    private String url;

    private Boolean isRecruiting;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_field_id")
    private StudyField studyField;
}
