package com.ordnaelmedeiros.jpafluidselect.querybuilder.select.operation.operations;

import com.ordnaelmedeiros.jpafluidselect.querybuilder.select.operation.Operations;
import com.ordnaelmedeiros.jpafluidselect.querybuilder.select.ref.FieldRef;

public interface OperationLessThan<ObjBack, SelectTable, Table, Type> extends OperationBase<ObjBack, SelectTable, Table, Type> {
	
	/**
	 * Execute operation equal ( < )
	 * <ul>
	 * <li>JPQL: e.salary < 100000
	 * </ul>
	 * @return back
	 */
	default Operations<ObjBack,SelectTable, Table> lessThan(Type value) {
		this.setSql(this.toSql() + " < :" + this.createParam(value));
		return end();
	}
	
	/**
	 * Execute operation equal ( < )
	 * <ul>
	 * <li>JPQL: e.salary < 100000
	 * </ul>
	 * @return back
	 */
	default Operations<ObjBack,SelectTable, Table> lt(Type value) {
		return this.lessThan(value);
	}
	
	/**
	 * Execute operation equal ( < )
	 * <ul>
	 * <li>JPQL: e.salary < e.salary
	 * </ul>
	 * @return back
	 */
	default Operations<ObjBack,SelectTable, Table> lessThan(FieldRef<?> field) {
		this.setSql(this.toSql() + " < " + field.getSql());
		return this.end();
	}
	
	/**
	 * Execute operation equal ( < )
	 * <ul>
	 * <li>JPQL: e.salary < e.salary
	 * </ul>
	 * @return back
	 */
	default Operations<ObjBack,SelectTable, Table> lt(FieldRef<?> field) {
		return this.lessThan(field);
	}
	
}
