package br.ufal.ic.cosmos.project.spec.prov;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;

public interface ICRUDProjectOps {
	public List<ProjectDT> listProjects(); // Retorna todos os projetos existentes
	public ProjectDT getProject(int id); // Retorna o projeto especificado ou NULL caso n�o exista (ou d� erro)
	public int addProject(ProjectDT project);	// Retorna o ID do novo projeto criado ou -1 caso d� erro
	public boolean changeProject(int id, ProjectDT project); // Retorna true se OK. Retorna false caso contr�rio
	public boolean deleteProject(int id);	// Retorna true se OK. Retorna false caso contr�rio
}
