package com.singhal.bs.presenters.impl;

import java.util.Objects;

import com.singhal.bs.presenters.IPresenter;
import com.singhal.bs.views.IView;

public abstract class AbstractPresenter<T extends IView<?>> implements IPresenter<T> {
	
	protected T view;
	
	public AbstractPresenter() {
	}
	
	@Override
	public void setView(T view) {
		Objects.requireNonNull(view, "view can not be null");
		this.view = view;
	}

	@Override
	public void start() throws Exception {
		view.show();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
