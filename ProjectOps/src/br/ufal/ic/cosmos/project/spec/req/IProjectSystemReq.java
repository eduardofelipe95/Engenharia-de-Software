package br.ufal.ic.cosmos.project.spec.req;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.StyleDT;
import br.ufal.ic.cosmos.project.spec.dt.RequirementDT;

public interface IProjectSystemReq {
	// Requerimentos do ICRUDStyleOps
	public List<StyleDT> listStyle(); // Retorna todos os estilos
	public int createStyle(StyleDT project); // Retorna o código de erro ou 201 se CREATED
	public StyleDT readStyle(int id); // Retorna o estilo a ser lido ou null se NOT FOUND
	public int updateStyle(int id, StyleDT project); // Retorna o código de erro ou 200 se OK
	public int deleteStyle(int id); // Retorna código de erro ou 200 se OK
	
	// Requerimentos do ICRUDRequirementsOps
	public List<RequirementDT> listRequirements(); // Retorna todos os requerimentos
	public int createRequirement(RequirementDT project); // Retorna o código de erro ou 201 se CREATED
	public RequirementDT readRequirement(int id); // Retorna o requerimento a ser lido ou null se NOT FOUND
	public int updateRequirement(int id, RequirementDT project); // Retorna o código de erro ou 200 se OK
	public int deleteRequirement(int id); // Retorna código de erro ou 200 se OK
}
