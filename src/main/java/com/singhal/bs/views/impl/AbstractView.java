package com.singhal.bs.views.impl;

import java.io.IOException;

import com.singhal.bs.views.IView;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

public abstract class AbstractView<T> implements IView<T> {

	private String fxml;
	protected Callback<Class<?>, Object> controllerFactory;
	protected final T presenter;
	protected Stage stage;

	public AbstractView(Callback<Class<?>, Object> controllerFactory, String fxml, T presenter) throws IOException {
		this.controllerFactory = controllerFactory;
		this.fxml = "/" + fxml;
		this.presenter = presenter;
	}

	protected void setStage(Stage primaryStage) {
		this.stage = primaryStage;
	}

	@Override
	public void show() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
		fxmlLoader.setControllerFactory(controllerFactory);
		stage.setScene(new Scene(fxmlLoader.load()));
		stage.show();
	}

}
