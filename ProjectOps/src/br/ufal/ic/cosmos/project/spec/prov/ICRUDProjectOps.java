package br.ufal.ic.cosmos.project.spec.prov;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;

public interface ICRUDProjectOps {
	public ProjectDT addProject(ProjectDT project);
	public ProjectDT changeProject(int id, ProjectDT project);
	public void deleteProject(int id);

}
