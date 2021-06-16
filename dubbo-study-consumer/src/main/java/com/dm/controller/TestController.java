package com.dm.controller;

import com.dm.po.TestPO;
import com.dm.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
 * <p>创建日期：2021年06月16日 11:12</p>
 * <p>类全名：com.dm.controller.TestController</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@RestController
public class TestController
{
	@DubboReference
	TestService testService;

	@GetMapping("/getTestPO/{id}")
	public String getTestPO(@PathVariable("id") int id)
	{
		TestPO po = testService.getTestPO(id);
		return po.toString();
	}
}
