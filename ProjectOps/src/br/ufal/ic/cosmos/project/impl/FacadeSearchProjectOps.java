package br.ufal.ic.cosmos.project.impl;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;
import br.ufal.ic.cosmos.project.spec.prov.IManager;
import br.ufal.ic.cosmos.project.spec.prov.ISearchProjectOps;
import br.ufal.ic.cosmos.project.spec.req.IProjectBusinessReq;
import br.ufal.ic.cosmos.project.spec.req.IProjectSystemReq;

public class FacadeSearchProjectOps implements ISearchProjectOps{
	private IManager manager;
	private IProjectBusinessReq projectBusinessReq;
	private IProjectSystemReq projectSystemReq;
	
	public FacadeSearchProjectOps(IManager manager) {
		this.manager = manager;
	}

	@Override
	public List<ProjectDT> searchProjectStyle(int styleId) {
		//retirar o get que nao estiver usando
		this.projectBusinessReq = (IProjectBusinessReq)manager.getRequiredInterface("IProjectBusinessReq");
		this.projectSystemReq = (IProjectSystemReq)manager.getRequiredInterface("IProjectSystemReq");
		//lógica para ...
		return null;
	}

	@Override
	public List<ProjectDT> searchProjectRequirement(List<Integer> requirementsId) {
		//retirar o get que nao estiver usando
		this.projectBusinessReq = (IProjectBusinessReq)manager.getRequiredInterface("IProjectBusinessReq");
		this.projectSystemReq = (IProjectSystemReq)manager.getRequiredInterface("IProjectSystemReq");
		//lógica para ...
		return null;
	}

}
