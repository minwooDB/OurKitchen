package com.ourkitchen.app.data.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class TimeEntity {

	@CreatedDate
	@Column(name="created_at", updatable=false)
	private LocalDateTime createdDate;

	@LastModifiedDate
	@Column(name="modified_at")
	private LocalDateTime modifiedDate;
}