package com.tus.usermanagement.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

	@CreatedDate
	@Column(updatable = false)
	private LocalDateTime createdAt;

//	@CreatedBy
//	@Column(updatable = false)
//	private String createdBy;
//
//	@LastModifiedDate
//	@Column(insertable = false)
//	private LocalDateTime updatedAt;
//
//	@LastModifiedBy
//	@Column(insertable = false)
//	private String updatedBy;
}
