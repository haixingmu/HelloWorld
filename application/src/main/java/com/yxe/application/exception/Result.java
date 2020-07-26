package com.yxe.application.exception;

public class Result<T> {

	public Result(Integer code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Result(Integer code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public Result(T data) {
		super();
		this.data = data;
	}

	// 接口调用成功或者失败
	private Integer code = 0;
	// 需要传递的信息，例如错误信息
	private String msg = "success";
	// 需要传递的数据
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Result<T> success(T data) {
		return new Result<T>(data);
	}

	public Result<T> fail(Integer code, String msg) {
		return new Result<T>(code, msg);
	}

}