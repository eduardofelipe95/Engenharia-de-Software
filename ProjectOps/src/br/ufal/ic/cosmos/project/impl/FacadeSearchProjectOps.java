package br.ufal.ic.cosmos.project.impl;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.cosmos.project.spec.dt.MetricDT;
import br.ufal.ic.cosmos.project.spec.dt.ProjectDT;
import br.ufal.ic.cosmos.project.spec.prov.ICRUDProjectOps;
import br.ufal.ic.cosmos.project.spec.prov.IManager;
import br.ufal.ic.cosmos.project.spec.prov.ISearchProjectOps;

public class FacadeSearchProjectOps implements ISearchProjectOps{
	private IManager manager;
	private ICRUDProjectOps projectOps;
	
	public FacadeSearchProjectOps(IManager manager) {
		this.manager = manager;
		this.projectOps = (ICRUDProjectOps)this.manager.getProvidedInterface("ICRUDProjectOps");
	}

	@Override
	public List<ProjectDT> searchProjectByStyles(List<Integer> stylesIds) {
		// Instanciando a lista que será retornada
		List<ProjectDT> projectsToReturn = new ArrayList<ProjectDT>();
		
		// Obtendo a lista total de projetos existentes no Banco de Dados
		List<ProjectDT> allProjects = this.projectOps.listProjects();
		
		// Iterando sobre a lista de projetos existentes
		for(ProjectDT project : allProjects) {
			boolean alreadyAdded = false;
			// Iterando pelos estilos pesquisados
			for(Integer styleId : stylesIds) {
				// Comparando se o projeto atual possui ao menos um dos estilos pesquisados
				if (project.styles.get(styleId) != null) {
					projectsToReturn.add(project);
					alreadyAdded = true;
				}
				// Verificando se o projeto já consta na lista de retorno
				if (alreadyAdded)
					break;
			}
		}
		return projectsToReturn;
	}

	@Override
	public List<ProjectDT> searchProjectByRequirements(List<Integer> requirementsIds) {
		List<ProjectDT> projectsToReturn = new ArrayList<ProjectDT>();
		List<ProjectDT> allProjects = this.projectOps.listProjects();
		for(ProjectDT project : allProjects) {
			boolean alreadyAdded = false;
			for(Integer requirementId : requirementsIds) {
				if (project.styles.get(requirementId) != null) {
					projectsToReturn.add(project);
					alreadyAdded = true;
				}
				if (alreadyAdded)
					break;
			}
		}
		return projectsToReturn;
	}

	@Override
	public List<ProjectDT> searchProjectByMetrics(List<MetricDT> metrics, List<Double> minValues, List<Double> maxValues) {
			List<ProjectDT> projectsToReturn = new ArrayList<ProjectDT>();
			List<ProjectDT> allProjects = this.projectOps.listProjects();
			for(ProjectDT project : allProjects) {
				// Inicializa como projeto válido (assume que todas a métricas estão dentro dos limites)
				boolean projectIsValid = true;
				for(int i = 0; i < metrics.size(); i++) {
					
					// Checa se a métrica selecionada existe no projeto
					MetricDT metric = metrics.get(i);
					MetricDT projectMetric = project.metrics.get( metric.id );
					
					if (projectMetric != null) {
						Double minValue = minValues.get(i);
						Double maxValue = maxValues.get(i);
						// Checa se a métrica está dentro do intervalo aceitável
						if ( projectMetric.value < minValue || projectMetric.value > maxValue) {
							projectIsValid = false;
							break;
						}
					}
				}
				// Se todas as métricas selecionadas estiverm Ok, adicione à lista de retorno
				if (projectIsValid)
					projectsToReturn.add(project);
			}
			return projectsToReturn;
	}

}
