package com.singhal.bs.views.impl;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.singhal.bs.constants.FXMLS;
import com.singhal.bs.presenters.IHomePresenter;
import com.singhal.bs.views.IHomeView;

import javafx.stage.Stage;
import javafx.util.Callback;

@Component
public class HomeView extends AbstractView<IHomePresenter> implements IHomeView {

	public HomeView(Callback<Class<?>, Object> controllerFactory) throws IOException {
		super(controllerFactory, FXMLS.HOME.BASE);
	}

	@Override
	public void show() throws IOException {
		super.setStage((Stage) controllerFactory.call(Stage.class));
		super.show();
	}

}
