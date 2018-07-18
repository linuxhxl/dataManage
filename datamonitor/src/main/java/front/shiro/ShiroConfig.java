package front.shiro;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Jesse on 2018/6/5.
 */
@Configuration
public class ShiroConfig {

	/**
	 * shiro拦截器
	 *
	 * @param securityManager
	 * @return
	 */
	@Bean
	public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		//拦截链
		Map<String, String> filertChainMap = new LinkedHashMap<>();
		filertChainMap.put("/login", "anon");
		//网站图标
		filertChainMap.put("/favicon.ico", "anon");
		//静态资源不被拦截
		filertChainMap.put("/static/**", "anon");
		//webjars不被拦截
		filertChainMap.put("/webjars/**", "anon");
		//登出
		filertChainMap.put("/logout", "logout");
		//authc:所有url必须通过认证才可访问
		filertChainMap.put("/**", "authc");
		//设置登录页
		shiroFilterFactoryBean.setLoginUrl("/login");
		//登录成功页
		shiroFilterFactoryBean.setSuccessUrl("/index");
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filertChainMap);
		return shiroFilterFactoryBean;
	}

	@Bean
	public SecurityManager securityManager() {
		return new DefaultWebSecurityManager(shiroRealm());
	}

	@Bean
	public ShiroRealm shiroRealm() {
		return new ShiroRealm();
	}
}
