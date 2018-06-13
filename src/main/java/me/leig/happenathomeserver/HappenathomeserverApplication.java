package me.leig.happenathomeserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("me.leig.happenathomeserver.dao.mapper")
public class HappenathomeserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(HappenathomeserverApplication.class, args);
	}
}
