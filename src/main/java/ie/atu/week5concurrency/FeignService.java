package ie.atu.week5concurrency;

import org.springframework.stereotype.Service;

@Service
public class FeignService {

    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);

        try {
            Thread.sleep(10000);
            System.out.println("Calling delay");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        return td;
    }
}
