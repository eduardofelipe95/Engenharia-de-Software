package br.ufal.ic.cosmos.project.spec.prov;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;


public interface ISearchProjectOps {
	public List<ProjectDT> searchProjectStyle(int styleId);
	public List<ProjectDT> searchProjectRequirement(List<Integer> requirementsId); 

}
