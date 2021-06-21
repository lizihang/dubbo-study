package com.dm.service.impl;

import com.dm.service.Module1Service;
import com.dm.service.Module2Service;
import com.dm.vo.QueryParams;
import com.dm.vo.Result;
import org.apache.dubbo.apidocs.annotations.ApiDoc;
import org.apache.dubbo.apidocs.annotations.ApiModule;
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
 * <p>创建日期：2021年06月17日 16:03</p>
 * <p>类全名：com.dm.service.impl.Module2ServiceImpl</p>
 * 查看帮助：<a href="" target="_blank"></a>
 */
@ApiModule(value = "模块2", apiInterface = Module2Service.class)
@DubboService(version = "1.0.0")
public class Module2ServiceImpl implements Module2Service
{
	@ApiDoc(value = "测试model2", description = "描述", responseClassDescription = "响应的数据的描述")
	public Result testModule2(QueryParams params)
	{
		String msg = "this is module 2 service impl,params code=" + params.getCode();
		System.out.println(msg);
		Result result = new Result();
		result.setCode("200");
		result.setMsg(msg);
		result.setData("null");
		return result;
	}
}
