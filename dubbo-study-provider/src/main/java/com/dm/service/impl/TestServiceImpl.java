package com.dm.service.impl;

import com.dm.po.TestPO;
import com.dm.service.TestService;
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
 * <p>创建日期：2021年06月16日 11:08</p>
 * <p>类全名：com.dm.service.impl.TestServiceImpl</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@DubboService()
public class TestServiceImpl implements TestService
{
	@Override
	public TestPO getTestPO(int id)
	{
		return new TestPO(id,"TestName","Test@163.com",18);
	}
}
