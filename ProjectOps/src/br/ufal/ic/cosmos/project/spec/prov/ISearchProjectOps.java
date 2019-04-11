package br.ufal.ic.cosmos.project.spec.prov;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.MetricDT;
import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;

public interface ISearchProjectOps {
	public List<ProjectDT> searchProjectByStyles(List <Integer> stylesIds);
	public List<ProjectDT> searchProjectByRequirements(List<Integer> requirementsIds);  
	public List<ProjectDT> searchProjectByMetrics(List<MetricDT> metrics, List<Double> minValues, List<Double> maxValues);
}
