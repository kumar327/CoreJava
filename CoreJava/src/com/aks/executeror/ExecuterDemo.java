package com.aks.executeror;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuterDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(6);
		// es.su

		List<Future<String>> list = new ArrayList();
		List<Future<String>> call = new ArrayList();

		for (int i = 0; i < 20; i++) {
//			es.execute(new Employee(i));

			list.add((Future<String>) es.submit(new Employee(i)));
			call.add((Future<String>) es.submit(new Employee1(i)));

		}

		for (Future<String> future : list) {
			System.out.println(future.get());
		}

		for (Future<String> future : call) {
			System.out.println(future.get());
		}
		es.shutdown();
	}
}

class Employee implements Runnable {

	int i;

	public Employee(int i) {
		this.i = i;
	}

	@Override
	public void run() {

		System.out.println("Employee Runnable Class " + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Employee1 implements Callable<String> {

	int i;

	public Employee1(int i) {
		this.i = i;
	}

	@Override
	public String call() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		return "Employee Callable Class " + i;
	}
}