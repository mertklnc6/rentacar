package com.turkcell.rentacar.adapter;

import com.turkcell.rentacar.adapter.result.FindexResult;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class FindexAdapter implements FindexService{
    private RestTemplate restTemplate;
    public FindexResult getFindexScoreofCustomer(int customerId) {
        String url = "http://localhost:8080/findex/" + customerId;
        return this.restTemplate.getForObject(url, FindexResult.class);
    }
}
