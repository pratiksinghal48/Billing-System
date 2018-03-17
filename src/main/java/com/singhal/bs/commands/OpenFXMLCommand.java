package com.singhal.bs.commands;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

public class OpenFXMLCommand implements ICommand {
	
	private Stage stage;
	
	public OpenFXMLCommand(Callback<Class<?>, Object> controllerFactory, Stage stage, String fxml) throws IOException {
		this.stage = stage;
		fxml = "/" + fxml;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxml));
		fxmlLoader.setControllerFactory(controllerFactory);
		stage.setTitle("Hello World");
		stage.setScene(new Scene(fxmlLoader.load(), 800, 600));
	}

	@Override
	public void execute() {
        stage.show();
	}
	
	public Stage getStage() {
		return stage;
	}

}
