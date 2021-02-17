
public class SubElement implements Comparable<SubElement> {

	private Integer id;
	private String element;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public SubElement(Integer id, String element) {
		super();
		this.id = id;
		this.element = element;
	}

	@Override
	public int compareTo(SubElement arg0) {
		// TODO Auto-generated method stub
		return arg0.getId().compareTo(this.id);
	}

	@Override
	public String toString() {
		return "SubElement [id=" + id + ", element=" + element + "]";
	}

}
