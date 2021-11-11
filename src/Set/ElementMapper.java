import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class ElementMapper {

	public ElementMapper() {
		// TODO Auto-generated constructor stub
	}

	public Element createElementIfNotExist(TreeSet<Element> subElements, Element element) {
		for (Iterator iterator = subElements.iterator(); iterator.hasNext();) {
			Element subElement = (Element) iterator.next();
			if (subElement.getId().equals(element.getId())) {
				return subElement;
			}
		}
		return new Element(element.getId(), element.getElementName());
	}

	public Element createSubElementIfNotExist(TreeSet<Element> subElements, Element element) {
		return new Element(element.getId(), element.getElementName());
	}

	public TreeSet<Element> createNode(TreeMap<String, TreeSet<Element>> elements, String key) {
		TreeSet<Element> node = new TreeSet<Element>();
		if (elements.get(key) != null) {
			return elements.get(key);
		}
		elements.put(key, node);
		return node;
	}

	public List<List<String>> parseList() {
		return Arrays.asList(Arrays.asList("NIVEAU_1-NIVEAU_3", "1", "L01"), Arrays.asList("NIVEAU_1-NIVEAU_2", "1"),
				Arrays.asList("NIVEAU_2", "1"));
	}

	public Element findElement(TreeSet<Element> subElements, Element element) {
		for (Iterator iterator = subElements.iterator(); iterator.hasNext();) {
			Element subElement = (Element) iterator.next();
			if (subElement.getId().equals(element.getId())) {
				return subElement;
			}
		}
		return element;
	}

}
