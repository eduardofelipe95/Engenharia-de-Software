package br.ufal.ic.cosmos.project.impl;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;
import br.ufal.ic.cosmos.project.spec.prov.ICRUDProjectOps;
import br.ufal.ic.cosmos.project.spec.prov.IManager;
import br.ufal.ic.cosmos.project.spec.req.IProjectBusinessReq;
import br.ufal.ic.cosmos.project.spec.req.IProjectSystemReq;

public class FacadeCRUDProjectOps implements ICRUDProjectOps {
	private IManager manager;
	private IProjectBusinessReq projectBusinessReq;
	private IProjectSystemReq projectSystemReq;
	
	public FacadeCRUDProjectOps(IManager manager) {
		this.manager = manager;
	}

	
	@Override
	public ProjectDT addProject(ProjectDT project) {
		//retirar o get que nao estiver usando
		this.projectBusinessReq = (IProjectBusinessReq)manager.getRequiredInterface("IProjectBusinessReq");
		this.projectSystemReq = (IProjectSystemReq)manager.getRequiredInterface("IProjectSystemReq");
		//lógica para ...
		return null;
	}

	@Override
	public ProjectDT changeProject(int id, ProjectDT project) {
		//retirar o get que nao estiver usando
		this.projectBusinessReq = (IProjectBusinessReq)manager.getRequiredInterface("IProjectBusinessReq");
		this.projectSystemReq = (IProjectSystemReq)manager.getRequiredInterface("IProjectSystemReq");
		//lógica para ...s
		return null;
	}

	@Override
	public void deleteProject(int id) {
		//retirar o get que nao estiver usando
		this.projectBusinessReq = (IProjectBusinessReq)manager.getRequiredInterface("IProjectBusinessReq");
		this.projectSystemReq = (IProjectSystemReq)manager.getRequiredInterface("IProjectSystemReq");
		//lógica para ...
		
	}

}
