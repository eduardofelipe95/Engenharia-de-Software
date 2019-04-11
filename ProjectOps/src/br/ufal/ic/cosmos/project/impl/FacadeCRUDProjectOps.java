package br.ufal.ic.cosmos.project.impl;

import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;
import br.ufal.ic.cosmos.project.spec.prov.ICRUDProjectOps;
import br.ufal.ic.cosmos.project.spec.prov.IManager;
import br.ufal.ic.cosmos.project.spec.req.IProjectBusinessReq;

public class FacadeCRUDProjectOps implements ICRUDProjectOps {
	private IManager manager;
	private IProjectBusinessReq businessReq;
	
	public FacadeCRUDProjectOps(IManager manager) {
		this.manager = manager;
		this.businessReq = (IProjectBusinessReq) this.manager.getRequiredInterface("IProjectBusinessReq");
	}

	@Override
	public List<ProjectDT> listProjects() {
		return this.businessReq.list();
	}

	@Override
	public ProjectDT getProject(int id) {
		return this.businessReq.read(id);
	}

	@Override
	public int addProject(ProjectDT project) {
		int response = this.businessReq.create(project);
		if (response == 201) {
			return this.businessReq.lastId();
		} else {
			return -1;
		}
	}

	@Override
	public boolean changeProject(int id, ProjectDT project) {
		int response = this.businessReq.update(id, project);
		return (response == 200);
	}

	@Override
	public boolean deleteProject(int id) {
		int response = this.businessReq.delete(id);
		return (response == 200);
	}

}
