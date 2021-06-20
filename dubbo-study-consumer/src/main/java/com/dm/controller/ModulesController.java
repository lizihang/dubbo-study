package com.dm.controller;

import com.dm.service.Module1Service;
import com.dm.service.Module2Service;
import com.dm.service.Module3Service;
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
 * <p>创建日期：2021年06月17日 16:06</p>
 * <p>类全名：com.dm.controller.ModulesController</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@RestController
public class ModulesController
{
	@DubboReference(version = "1.0.0")
	Module1Service module1Service;
	@DubboReference(version = "1.0.0")
	Module2Service module2Service;
	@DubboReference(version = "1.0.0")
	Module3Service module3Service;

	@GetMapping("testModule1")
	public String testModule1()
	{
		return module1Service.testModule1("param");
	}

	@GetMapping("testModule2")
	public String testModule2()
	{
		return module2Service.testModule2();
	}

	@GetMapping("testModule3")
	public String testModule3()
	{
		return module3Service.testModule3();
	}
}
