package org.javababe.springsession.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author LS
 * @date 2020/5/14 10:33 星期四
 */
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800)
public class SpringSessionConfig {

 /*   @Value("${redis.hostname:localhost}")
    private String hostname;

    @Value("${redis.port:6379}")
    private Integer port;*/


    /*@Bean
    public JedisConnectionFactory connectionFactory() {
        JedisConnectionFactory connectionFactory = new JedisConnectionFactory();

        connectionFactory.setHostName(hostname);
        connectionFactory.setPort(port);

        return connectionFactory;
    }*/

}
