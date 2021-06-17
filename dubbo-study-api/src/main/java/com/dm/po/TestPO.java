package com.dm.po;

import java.io.Serializable;
/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <pre>
 * 其他说明：
 * </pre>
 * <p>作者：lizh</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2021年06月16日 11:04</p>
 * <p>类全名：com.dm.po.TestPO</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class TestPO implements Serializable
{
	private int    id;
	private String name;
	private String email;
	private int    age;
	private String version;

	public TestPO()
	{
	}

	public TestPO(int id, String name, String email, int age, String version)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.version = version;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	@Override
	public String toString()
	{
		return "TestPO{" + "id=" + id + ", name='" + name + '\'' + ", email='" + email + '\'' + ", age=" + age + ", version='" + version + '\'' + '}';
	}
}
