package com.ordnaelmedeiros.jpafluidselect.querybuilder.select.operation.operations;

import com.ordnaelmedeiros.jpafluidselect.querybuilder.select.operation.Operations;

public interface OperationIsNull<ObjBack, SelectTable, Table, Type> extends OperationBase<ObjBack, SelectTable, Table, Type> {
	
	/**
	 * Execute operation IS NULL
	 * <ul>
	 * <li>JPQL: e.endDate IS NULL
	 * </ul>
	 * @return back
	 */
	default Operations<ObjBack,SelectTable, Table> isNull() {
		this.setSql(this.toSql() + " IS NULL");
		return end();
	}
	
}
