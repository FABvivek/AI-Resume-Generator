package com.resume.backend;

import com.resume.backend.service.ResumeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ResumeAiBackendApplicationTests {
	@Autowired
	private ResumeService resumeService;

	@Test
	@Timeout(value = 2, unit = TimeUnit.MINUTES)
	void contextLoads() throws IOException {
		 resumeService.generateResumeResponse(
				"I am Vivek Singh with 2 years of Java experience in Spring Boot"
		);


	}


}
