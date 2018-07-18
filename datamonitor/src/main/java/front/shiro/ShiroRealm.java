package front.shiro;

import front.entity.User;
import front.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * 身份校验核心处理类
 * Created by Jesse on 2018/6/5.
 */
public class ShiroRealm extends AuthorizingRealm {

	@Resource
	private UserService userService;

	@Override
	//权限控制:无需控制返回为空
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		return null;
	}

	@Override
	//身份认证
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
		//获取用户输入的账号和密码
		UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
		String username = token.getUsername();
		String psw = String.valueOf(token.getPassword());
		//获取数据库中用户信息
		User user = userService.queryByName(username);
		if (user == null||!psw.equals(user.getPassword())) {
			throw new AuthenticationException();
		}
		//保存用户登录信息至Session
		SecurityUtils.getSubject().getSession().setAttribute("user",user);
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), getName());
		return authenticationInfo;
	}
}
