/**
 * 
 */
package com.framework.executor.testexecutor.controller;

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.framework.executor.testexecutor.model.TestExecutorResponse;
import com.framework.executor.tests.RunCucumberTest;


/**
 * @author surendrane
 *
 */
@RestController
@RequestMapping("/api/v1")
public class TestExecutorController {

	@PostMapping("/trigger")
	public ResponseEntity<TestExecutorResponse> triggerCucumberTests() {
		TestExecutorResponse testExecutorResponse = new TestExecutorResponse();
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(RunCucumberTest.class);
		testExecutorResponse.setBuildId(1);
		
		
		return new ResponseEntity<TestExecutorResponse>(testExecutorResponse, HttpStatus.OK);
	}
}
