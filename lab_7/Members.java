package lab_7;

import java.io.Serializable;

public class Members implements Serializable{

	private String memberName;
	private String type;
	
	public Members(String memebrName, String type) {
		
		this.memberName = memebrName;
		this.type = type;
	}

	
	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Members memberName=" + memberName + ", type=" + type;
	}
	
	
}
