package com.module.db.common.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Getter
public class PagingModel<T> {
	private long recordsTotal;
	private Pageable pageable;
	private List<T> data;

	@Builder
	public PagingModel(long recordsTotal, List<T> data, Pageable pageable) {
		this.recordsTotal = recordsTotal;
		this.pageable = pageable;
		this.data = data;
	}
}
