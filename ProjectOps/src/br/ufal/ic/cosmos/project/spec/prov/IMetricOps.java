package br.ufal.ic.cosmos.project.spec.prov;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.MetricDT;

public interface IMetricOps {
	public List<MetricDT> calculateProjectMetrics(int projectId);

}
