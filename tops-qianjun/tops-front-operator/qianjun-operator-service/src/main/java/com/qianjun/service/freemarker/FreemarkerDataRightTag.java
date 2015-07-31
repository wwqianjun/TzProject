package com.qianjun.service.freemarker;

import java.io.IOException;
import java.util.Map;

import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

/**
 * 用来判断权限的标签
 * @author zhengzhichao
 *
 */
public class FreemarkerDataRightTag implements TemplateDirectiveModel {
	
	@Override
	public void execute(Environment env, Map params, TemplateModel[] loopVars,
			TemplateDirectiveBody body) throws TemplateException, IOException {
		
		//参数
		if(params.isEmpty()){
			throw new TemplateModelException("参数不能为空，需要权限编码(code)");
		}
		
		TemplateModel valueModel = (TemplateModel)params.get("code");
		
		if(valueModel == null){
			throw new TemplateModelException("权限编码(code)不存在");
		}
		String dataRightCode = valueModel.toString();
		
		//当前用户拥有的权限
//		UserSessionInfo userSessionInfo = UserSessionHelp.getUserSessionInfo();
//		if(userSessionInfo != null){
//			Map<String, String> dataRights = userSessionInfo.getAuthCodes();
//			if(dataRights.containsKey(dataRightCode)){//判断当前用户是否拥有这个权限
//				body.render(env.getOut());
//			}
//		}
	}

}
