package models;

public class MyNotePadModel {
	
	private String fileName;
	private String content;
	
	public MyNotePadModel() {
		this.fileName = "";
		this.content = "";
	}

	public MyNotePadModel(String fileName, String content) {
		
		this.fileName = fileName;
		this.content = content;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	

}
