package com.dm.service.impl;

import com.dm.po.TestPO;
import com.dm.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;
/**
 * <p>标题：dubbo多版本配置</p>
 * <p>功能：</p>
 * <pre>
 * 其他说明：
 * </pre>
 * <p>作者：lizh</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2021年06月17日 10:50</p>
 * <p>类全名：com.dm.service.impl.TestServiceImpl2</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@DubboService(version = "2.0.0")
public class TestServiceImpl2 implements TestService
{
	@Override
	public TestPO getTestPO(int id)
	{
		return new TestPO(id, "TestName", "Test@163.com", 18, "2.0.0");
	}
}
