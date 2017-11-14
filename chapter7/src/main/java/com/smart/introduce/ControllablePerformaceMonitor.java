package com.smart.introduce;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
public class ControllablePerformaceMonitor
		extends
			DelegatingIntroductionInterceptor implements Monitorable, Testable {
	private ThreadLocal<Boolean> MonitorStatusMap = new ThreadLocal<Boolean>();
	public void setMonitorActive(boolean active) {
		MonitorStatusMap.set(active);
	}

	//拦截方法
	public Object invoke(MethodInvocation mi) throws Throwable {
		Object obj = null;

		//对于支持性能监视可控代理，通过判断其状态觉得是否开启性能检测功能
		if (MonitorStatusMap.get() != null && MonitorStatusMap.get()) {
			PerformanceMonitor.begin(mi.getClass().getName() + "."
					+ mi.getMethod().getName());
			obj = super.invoke(mi);
			PerformanceMonitor.end();
		} else {
			obj = super.invoke(mi);
		}
		return obj;
	}
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("dd");
	}
}
