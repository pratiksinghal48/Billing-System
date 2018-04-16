package com.singhal.bs.presenters;

import com.singhal.bs.views.IView;

public interface IPresenter<T extends IView<?>> {
	public void setView(T view);
	public void start() throws Exception;
	public void stop();
}
