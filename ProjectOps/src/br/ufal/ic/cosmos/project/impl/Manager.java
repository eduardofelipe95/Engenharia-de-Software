package br.ufal.ic.cosmos.project.impl;

import java.util.HashMap;
import java.util.Set;

import br.ufal.ic.cosmos.project.spec.prov.IManager;

public class Manager implements IManager{
	private HashMap<String, Object> providedInterfaces;
	private HashMap<String, Object> requiredInterfaces;

	Manager(){
		this.providedInterfaces = new HashMap<String, Object>();
		this.requiredInterfaces = new HashMap<String, Object>();

		this.providedInterfaces.put("ICRUDProjectOps", new FacadeCRUDProjectOps(this));
		this.providedInterfaces.put("IMetricOps", new FacadeMetricsOps(this));
		this.providedInterfaces.put("ISearchProjectOps", new FacadeSearchProjectOps(this));
		
		this.requiredInterfaces.put("IProjectBusinessReq", null);
		this.requiredInterfaces.put("IProjectSystemReq", null);
	}

	@Override
	public Set<String> getProvidedInterfaces() {
		return this.providedInterfaces.keySet();
	}

	@Override
	public Set<String> getRequiredInterfaces() {
		return this.requiredInterfaces.keySet();
	}

	@Override
	public Object getProvidedInterface(String interfaceName) {
		return this.providedInterfaces.get(interfaceName);
	}

	@Override
	public void setRequiredInterface(String interfaceName, Object interfaceObject) {
		this.requiredInterfaces.put(interfaceName, interfaceObject);
	}
	
	@Override
	public Object getRequiredInterface(String interfaceName) {
		return this.requiredInterfaces.get(interfaceName);
	}

}
