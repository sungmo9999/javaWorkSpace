package com.kh.chap03_generic.model.vo;

public class Generic2 <T /* extends Parent */> {//
	private T t;
	
	public void printing() {
		//t.doPrint();
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}

}
