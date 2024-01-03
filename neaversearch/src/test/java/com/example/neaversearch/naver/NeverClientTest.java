package com.example.neaversearch.naver;

import com.example.neaversearch.naver.dto.SearchImageReq;
import com.example.neaversearch.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class NeverClientTest {
    @Autowired
    private NaverClient naverClient;

    @Test
    public void searchLocalTest(){
        var search = new SearchLocalReq();
        search.setQuery("갈비탕");

        var result = naverClient.searchLocal(search);

        System.out.println(result);
        Assertions.assertNotNull(result.getItems().stream().findFirst().get().getCategory());

    }

    @Test
    public void searchImageTest(){
        var search = new SearchImageReq();
        search.setQuery("망고");
        var result = naverClient.searchImageRes(search);
        System.out.println(result);
    }
}
