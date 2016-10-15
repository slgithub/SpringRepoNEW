package com.springbootex;

import org.cassandraunit.spring.CassandraUnitDependencyInjectionTestExecutionListener;

import org.springframework.core.Ordered;

public class OrderedCassandraTestExecutionListener
		extends CassandraUnitDependencyInjectionTestExecutionListener {

	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}

}