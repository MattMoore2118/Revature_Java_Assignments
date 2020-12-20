package inheritance_task;

public class Project_ {
	
	private int projectId;
	private String projectName;
	private String ClientName;
	public Project_() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project_(int projectId, String projectName, String clientName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		ClientName = clientName;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	@Override
	public String toString() {
		return "Project_ [projectId=" + projectId + ", projectName=" + projectName + ", ClientName=" + ClientName + "]";
	}
	

}
