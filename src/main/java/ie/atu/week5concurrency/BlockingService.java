package ie.atu.week5concurrency;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BlockingService {
    private final RestTemplate restTemplate;

    public BlockingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchDataBlocking() {
        //Simulate delay of 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://jsonplaceholder.typicode.com/todos/1", String.class);
    }
}
