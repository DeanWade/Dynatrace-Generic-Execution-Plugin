package com.dynatrace.diagnostics.plugin.extendedexecutor;

import com.dynatrace.diagnostics.pdk.Monitor;
import com.dynatrace.diagnostics.pdk.MonitorEnvironment;
import com.dynatrace.diagnostics.pdk.Status;

public class GEMonitor extends GenericExecutor implements Monitor {
	@Override
	public Status setup(MonitorEnvironment env) throws Exception {
		return super.setup(env);
	}

	@Override
	public Status execute(MonitorEnvironment env) throws Exception {
		Status result = super.execute(env);

		return result;
	}

	@Override
	public void teardown(MonitorEnvironment env) throws Exception {
		super.teardown(env);
	}

}
