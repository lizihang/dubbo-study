package com.dm.service.impl;

import com.dm.service.Module1Service;
import org.apache.dubbo.config.annotation.DubboService;
/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <pre>
 * 其他说明：
 * </pre>
 * <p>作者：lizh</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2021年06月17日 15:44</p>
 * <p>类全名：com.dm.service.impl.Module1ServiceImpl</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@DubboService(version = "1.0.0")
public class Module1ServiceImpl implements Module1Service
{
	public String testModule1()
	{
		String msg = "this is module 1 service impl";
		System.out.println(msg);
		return msg;
	}
}
