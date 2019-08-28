package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@SuppressWarnings("serial")
//@NoArgsConstructor		//空参构造
//@AllArgsConstructor	全参构造函数
//@Data					//set、get方法
//@Accessors(chain=true)	//链式风格访问
public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	public Dept(String dname)
	{
		super();
		this.dname = dname;
	}

	public Long getDeptno() {
		return deptno;
	}

	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDb_source() {
		return db_source;
	}

	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"deptno=" + deptno +
				", dname='" + dname + '\'' +
				", db_source='" + db_source + '\'' +
				'}';
	}

	public Dept(String dname, String db_source) {
		this.dname = dname;
		this.db_source = db_source;
	}

	public Dept(Long deptno, String dname, String db_source) {
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}

	public Dept() {
	}
}
