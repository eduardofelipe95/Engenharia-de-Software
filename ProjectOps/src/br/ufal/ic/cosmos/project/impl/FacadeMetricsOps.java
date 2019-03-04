package br.ufal.ic.cosmos.project.impl;

import java.util.List;


import br.ufal.ic.cosmos.project.spec.dt.MetricDT;
import br.ufal.ic.cosmos.project.spec.prov.IManager;
import br.ufal.ic.cosmos.project.spec.prov.IMetricOps;
import br.ufal.ic.cosmos.project.spec.req.IProjectBusinessReq;
import br.ufal.ic.cosmos.project.spec.req.IProjectSystemReq;

public class FacadeMetricsOps implements IMetricOps{
	private IManager manager;
	private IProjectBusinessReq projectBusinessReq;
	private IProjectSystemReq projectSystemReq;
	
	public FacadeMetricsOps(IManager manager) {
		this.manager = manager;
	}

	@Override
	public List<MetricDT> calculateProjectMetrics(int projectId) {
		
		//retirar o get que nao estiver usando
		this.projectBusinessReq = (IProjectBusinessReq)manager.getRequiredInterface("IProjectBusinessReq");
		this.projectSystemReq = (IProjectSystemReq)manager.getRequiredInterface("IProjectSystemReq");
		//lógica para ...
		return null;
	}

}
