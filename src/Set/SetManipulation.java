package Set;

import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

import model.Element;
import model.ElementMapper;

public class SetManipulation {
	
	
	public static void parcourirElement() {		
	ElementMapper elementMapper = new ElementMapper();
	TreeMap<String, TreeSet<Element>> treeMap = new TreeMap<String, TreeSet<Element>>();
	List<List<String>> rattachement = elementMapper.parseList();
	Element element = null;
	TreeSet<Element> node = elementMapper.createNode(treeMap, rattachement.get(0).get(0));
		for (int i = 1; i < rattachement.size(); i++) {
			String type = rattachement.get(i).get(0);
			String id = rattachement.get(i).get(1);
			System.out.println(type + " " + id);
			element = elementMapper.createElementIfNotExist(node, new Element(Integer.parseInt(id), type));
			Element subElement = elementMapper.createSubElementIfNotExist(element.getSubelement(),
					new Element(Integer.parseInt(id), type));
			element.getSubelement().add(subElement);
		}
	node.add(element);
	Collection<Entry<String, TreeSet<Element>>> values = treeMap.entrySet();

		for (Entry<String, TreeSet<Element>> entry : values) {
			System.out.println(entry.getKey() + " + " + entry.getValue().toString());
		}
	}
}
