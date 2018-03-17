package com.singhal.bs.presenters.impl;

import com.singhal.bs.presenters.IPresenter;
import com.singhal.bs.views.IView;

public abstract class AbstractPresenter<T extends IView<?>> implements IPresenter {
	
	protected T view;
	
	public AbstractPresenter(T view) {
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
