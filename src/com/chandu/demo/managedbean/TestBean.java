package com.chandra.demo.managedbean;

import javax.annotation.ManagedBean;

import com.chandra.demo.interceptor.binding.Validated;

@ManagedBean
@Validated
public class TestBean {

	public void test(final String s) {
		System.out.println(s);
	}

	public void test2(final String s) {
		System.out.println(s);
	}

	public void test3(final String s) {
		System.out.println(s);
	}
}
