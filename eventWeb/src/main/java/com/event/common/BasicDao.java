package com.event.common;

public interface BasicDao {
	<T extends BasicEntity> T save(T entity) throws Exception;
}
