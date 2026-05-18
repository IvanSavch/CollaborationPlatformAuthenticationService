package com.project.collaborationplatform.collaborationplatformauthenticationservice.model.entity;

import com.project.collaborationplatform.collaborationplatformauthenticationservice.configuration.AuditingConfiguration;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@EntityListeners(AuditingConfiguration.class)
@MappedSuperclass
@Getter
@Setter
public abstract class Auditable {
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
