package br.ufal.ic.cosmos.project.spec.prov;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.MetricDT;

public interface IMetricOps {
	public int updateProjectMetrics(int projectId); // Retorna código de erro ou zero se OK
	public List<MetricDT> getProjectMetrics(int projectId);
}
