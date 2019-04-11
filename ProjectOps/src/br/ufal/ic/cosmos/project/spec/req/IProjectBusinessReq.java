package br.ufal.ic.cosmos.project.spec.req;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;

public interface IProjectBusinessReq {
	public int authenticate(String username, String password);
	public List<ProjectDT> list(); // Retorna todos os projetos
	public int create(ProjectDT project); // Retorna o c�digo de erro ou 201 se CREATED
	public int lastId(); // Retorna o ID da �ltima receita cadastrada ou 404 se n�o existir
	public ProjectDT read(int id); // Retorna o projeto a ser lido ou null se NOT FOUND
	public int update(int id, ProjectDT project); // Retorna o c�digo de erro ou 200 se OK
	public int delete(int id); // Retorna c�digo de erro ou 200 se OK
}
