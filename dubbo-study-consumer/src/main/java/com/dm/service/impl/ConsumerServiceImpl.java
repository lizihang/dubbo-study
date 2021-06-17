package com.dm.service.impl;

import com.dm.service.ConsumerService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <pre>
 * 其他说明：
 * </pre>
 * <p>作者：lizh</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2021年06月17日 11:05</p>
 * <p>类全名：com.dm.service.impl.ConsumerServiceImpl</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@DubboService(version = "1.0.0")
@Component
public class ConsumerServiceImpl implements ConsumerService
{
	@Override
	public String testConsumer()
	{
		return "hello,this is consumer";
	}
}
