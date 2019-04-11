package br.ufal.ic.cosmos.project.spec.dt;

import java.util.HashMap;
import java.util.List;

public class ProjectDT {
	public int id;
	public HashMap<Integer, MetricDT> metrics;
	public HashMap<Integer, RequirementDT> requirements;
	public HashMap<Integer, StyleDT> styles;
	public EventDT creation;
	public List<EventDT> update;
	public EventDT updated;
}
