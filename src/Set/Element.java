package Set;
import java.util.TreeSet;

public class Element implements Comparable<Element> {

	private Integer id;
	private String elementName;
	private TreeSet<Element> subElement;

	public Element() {

	}

	public Element(Integer id, String elementName) {
		super();
		this.id = id;
		this.elementName = elementName;
		this.subElement = new TreeSet<Element>();
	}

	public Element(Integer id, String elementName, TreeSet<Element> subelement) {
		super();
		this.id = id;
		this.elementName = elementName;
		this.subElement = subelement;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public TreeSet<Element> getSubelement() {
		return subElement;
	}

	public void setSubElement(TreeSet<Element> subelement) {
		this.subElement = subElement;
	}

	@Override
	public String toString() {
		return "Element [id=" + id + ", elementName=" + elementName + ", subelement=" + subElement + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public int compareTo(Element arg0) {
		return Integer.compare(this.getId(), arg0.getId());
	}

}
