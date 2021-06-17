package com.dm.controller;

import com.dm.service.ProviderService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * <p>标题：</p>
 * <p>功能：</p>
 * <pre>
 * 其他说明：
 * </pre>
 * <p>作者：lizh</p>
 * <p>审核：</p>
 * <p>重构：</p>
 * <p>创建日期：2021年06月17日 11:10</p>
 * <p>类全名：com.dm.controller.ConsumerService</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@RestController
public class ConsumerService
{
	@DubboReference(version = "1.0.0")
	ProviderService providerService;

	@GetMapping("getProvider")
	public String getProvider()
	{
		return providerService.testProvider();
	}
}
