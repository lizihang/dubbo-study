package com.dm.vo;

import org.apache.dubbo.apidocs.annotations.RequestParam;
import org.apache.dubbo.apidocs.annotations.ResponseProperty;

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
 * <p>创建日期：2021年06月21日 10:08</p>
 * <p>类全名：com.dm.vo.Result</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class Result implements Serializable
{
	@ResponseProperty(value = "返回结果code", example = "200")
	private String code;
	@ResponseProperty(value = "返回结果msg", example = "查询成功")
	private String msg;
	@ResponseProperty(value = "返回结果data", example = "查询结果对象")
	private Object data;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	public Object getData()
	{
		return data;
	}

	public void setData(Object data)
	{
		this.data = data;
	}
}
