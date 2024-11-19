package sharda.ac.in.satyam;

public class Topic {

	private String topicId;
	private String topicName;
	private String topicDescription;
	
	Topic(String topicId,String topicName,String topicDescription)
	{
		this.topicId=topicId;
		this.topicName=topicName;
		this.topicDescription=topicDescription;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
}