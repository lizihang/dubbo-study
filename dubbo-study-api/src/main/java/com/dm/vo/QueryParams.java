package com.dm.vo;

import org.apache.dubbo.apidocs.annotations.RequestParam;

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
 * <p>创建日期：2021年06月21日 10:15</p>
 * <p>类全名：com.dm.vo.QueryParams</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
public class QueryParams implements Serializable
{
	@RequestParam(value = "请求参数名", required = true, description = "参数描述", example = "参数示例", defaultValue = "1", allowableValues = { "1", "2" })
	private String code;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}
}
