package ie.atu.week5concurrency.Examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TodoResponse {
    @JsonProperty("userId") //If returned JSON object has this value, assign to userId.
    private int userId;

    @JsonProperty("id") //If returned JSON object has this value, assign
    private int id;

    @JsonProperty("title")  //If returned JSON object has this value, assign
    private String title;

    @JsonProperty("completed")  //If returned JSON object has this value, assign
    private boolean completed;
}
