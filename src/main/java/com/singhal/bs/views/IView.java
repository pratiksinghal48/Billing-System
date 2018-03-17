package com.singhal.bs.views;

import java.io.IOException;

public interface IView<T>{
	public void setPresenter(T presenter);
	public void show() throws IOException;
}
