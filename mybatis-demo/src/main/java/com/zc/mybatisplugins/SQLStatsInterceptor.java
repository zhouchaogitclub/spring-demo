package com.zc.mybatisplugins;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.util.Properties;

/**
 * @author 周超
 * @since 2020/6/14 17:30
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class SQLStatsInterceptor implements Interceptor {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Object intercept(Invocation invocation) throws Throwable {

		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		BoundSql boundSql = statementHandler.getBoundSql();
		String sql = boundSql.getSql();
		logger.info("mybatis intercept sql:{}", sql);
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		String dialect = properties.getProperty("dialect");
		logger.info("mybatis intercept dialect:{}", dialect);
	}
}
