package br.ufal.ic.cosmos.project.impl;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.MetricDT;
import br.ufal.ic.cosmos.project.spec.prov.ICRUDProjectOps;
import br.ufal.ic.cosmos.project.spec.prov.IManager;
import br.ufal.ic.cosmos.project.spec.prov.IMetricOps;

public class FacadeMetricsOps implements IMetricOps{
	private IManager manager;
	private ICRUDProjectOps projectOps;
	
	public FacadeMetricsOps(IManager manager) {
		this.manager = manager;
		this.projectOps = (ICRUDProjectOps) this.manager.getProvidedInterface("ICRUDProjectOps");
	}

	@Override
	public int updateProjectMetrics(int projectId) {
		/**
		 * Calcula e atualiza as m�tricas do projeto. Retorna 0 se OK. Retorna o c�digo do erro, caso contr�rio.
		 */
		return 0;
	}

	@Override	
	public List<MetricDT> getProjectMetrics(int projectId) {
		/**
		 * As m�tricas s�o calculadas no momento de cria��o / atualiza��o do projeto. 
		 */
		List<MetricDT> metrics = (List<MetricDT>) (this.projectOps.getProject(projectId).metrics.values());
		return metrics;
	}

}
