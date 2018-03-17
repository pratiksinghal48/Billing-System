package com.singhal.bs.presenters.impl;

import org.springframework.stereotype.Component;

import com.singhal.bs.presenters.IHomePresenter;
import com.singhal.bs.views.IHomeView;
import com.singhal.bs.views.IView;

@Component
public class HomePresenter extends AbstractPresenter<IHomeView> implements IHomePresenter {
	
	public HomePresenter(IHomeView view) {
		super(view);
	}

	@Override
	public IView<?> getView() {
		return view;
	}

}
