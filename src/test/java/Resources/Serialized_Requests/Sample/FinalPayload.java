package Resources.Serialized_Requests.Sample;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FinalPayload {

    IssueType issue = new IssueType("Task");
    ObjectMapper objMap = new ObjectMapper();
    

}
