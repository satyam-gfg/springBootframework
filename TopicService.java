package sharda.ac.in.satyam;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
  private List<Topic> topics=Arrays.asList(new Topic("101","C","C Language"),
			new Topic("102","C++","C++ Language"),
			new Topic("103","Java","Java Language"));

  
  public List<Topic> getTopics()
  {
	  return topics;
  }
	
	
}