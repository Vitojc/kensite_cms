package com.seeyoui.kensite.common.taglib.expression.impl.user;

import com.seeyoui.kensite.common.taglib.expression.ExpressionBase;
import com.seeyoui.kensite.common.taglib.expression.ExpressionInterface;
import com.seeyoui.kensite.framework.system.util.UserUtils;

public class UserIdExpression extends ExpressionBase implements ExpressionInterface {

	@Override
	public String expresstionPares() {
		return UserUtils.getUser().getId();
	}
	
}
