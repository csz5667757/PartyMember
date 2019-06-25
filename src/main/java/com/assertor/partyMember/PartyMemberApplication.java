package com.assertor.partyMember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.assertor.partyMember.dao")
@SpringBootApplication
public class PartyMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(PartyMemberApplication.class, args);
		System.out.println("程序正在运行!");
	}
}
