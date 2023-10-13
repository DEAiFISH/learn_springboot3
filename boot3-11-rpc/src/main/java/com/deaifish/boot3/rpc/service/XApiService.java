package com.deaifish.boot3.rpc.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @description 远程调用Api
 *
 * @author DEAiFISH
 * @date 2023/10/12 16:26
 */
@Service
public class XApiService {

    public Mono<String> getIphoneByQQ(String QQ){

        WebClient webClient = WebClient.create();

        Mono<String> stringMono = webClient.get()
                .uri("https://zy.xywlapi.cc/qqapi?qq={QQ}", QQ)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);

        return stringMono;
    }
}
