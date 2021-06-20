package com.dm.service.impl;

import com.dm.service.Module1Service;
import org.apache.dubbo.apidocs.annotations.ApiDoc;
import org.apache.dubbo.apidocs.annotations.ApiModule;
import org.apache.dubbo.apidocs.annotations.RequestParam;
import org.apache.dubbo.apidocs.annotations.ResponseProperty;
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
@ApiModule(value = "模块1", apiInterface = Module1Service.class)
@DubboService(version = "1.0.0")
public class Module1ServiceImpl implements Module1Service
{
	@ApiDoc(value = "测试model1", description = "描述", responseClassDescription = "响应的数据的描述")
	public String testModule1(
			@RequestParam(value = "param1",
					required = true,
					description = "参数1",
					example = "abc",
					defaultValue = "aaa",
					allowableValues = { "a", "b" }) String param)
	{
		String msg = "this is module 1 service impl,param is:" + param;
		System.out.println(msg);
		return msg;
	}
}
