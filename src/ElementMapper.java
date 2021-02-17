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

	public SubElement createSubElementIfNotExist(TreeSet<SubElement> subElements, SubElement element) {

		return new SubElement(element.getId(), element.getElement());
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
		return Arrays.asList(Arrays.asList("HABITATION", "1", "L01"), Arrays.asList("GARANTIES", "1"),
				Arrays.asList("CLAUSESLIBRE", "1"));
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
