package com.bstackflow.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case execution started="+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case execution succsess="+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution faild="+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case execution skipped="+result.getName());
	}

	
}
