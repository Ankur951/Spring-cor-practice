package SpringCollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeenClassForCollection
{
	private String name;
	private List<String> phonNo;
	private Set <String> add;
	private Map <String,String> courses;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(List<String> phonNo) {
		this.phonNo = phonNo;
	}
	public Set<String> getAdd() {
		return add;
	}
	public void setAdd(Set<String> add) {
		this.add = add;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public BeenClassForCollection(String name, List<String> phonNo, Set<String> add, Map<String, String> courses) {
		super();
		this.name = name;
		this.phonNo = phonNo;
		this.add = add;
		this.courses = courses;
	}
	public BeenClassForCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BeenClassForCollection [name=" + name + ", phonNo=" + phonNo + ", add=" + add + ", courses=" + courses
				+ "]";
	}
    
	
	
	
}
