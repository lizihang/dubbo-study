package com.dm.service.impl;

import com.dm.service.Module3Service;
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
 * <p>创建日期：2021年06月17日 16:04</p>
 * <p>类全名：com.dm.service.impl.Module3ServiceImpl</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@DubboService(version = "1.0.0")
public class Module3ServiceImpl implements Module3Service
{
	public String testModule3()
	{
		String msg = "this is module 3 service impl";
		System.out.println(msg);
		return msg;
	}
}
