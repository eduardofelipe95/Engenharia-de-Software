package br.ufal.ic.cosmos.project.impl;

import br.ufal.ic.cosmos.project.spec.prov.IManager;

public class ComponentFactory {
private static IManager manager = null;
	
	private ComponentFactory() {
		// faz nada - SINGLETON
	}
	
	//FACTORY METHOD
	public static IManager createInstance(){
		//SINGLETON
		if(manager == null)
			manager = new Manager();
		return manager;
	}

}
