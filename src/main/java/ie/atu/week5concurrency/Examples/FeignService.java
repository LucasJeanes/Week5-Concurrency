package ie.atu.week5concurrency.Examples;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FeignService {

    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient) {

        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        ArrayList<TodoResponse> todoList = todoClient.fetchData();
        //System.out.println(todoList);

        int targetedValue = 196;
        //After fetching the data in from todoClient and saving it into the todoList.
        //Use list.stream() to convert the list into a stream, and filter for the object that has
        //an ID of 196. Find the first object that contains it, returns or else returns a null object to indicate not found.
        return todoList.stream().filter(todoItem -> todoItem.getId() == targetedValue).findFirst().orElse(null);
    }
}
