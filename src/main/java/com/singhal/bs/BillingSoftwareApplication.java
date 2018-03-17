package com.singhal.bs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.singhal.bs.presenters.IHomePresenter;

import javafx.application.Application;
import javafx.stage.Stage;

@SpringBootApplication
public class BillingSoftwareApplication extends Application {

	private ConfigurableApplicationContext springContext;

	@Override
	public void start(Stage primaryStage) throws Exception {
		springContext = SpringApplication.run(BillingSoftwareApplication.class);
		springContext.getBeanFactory().registerSingleton(Stage.class.getCanonicalName(), primaryStage);
		IHomePresenter homePresenter = springContext.getBean(IHomePresenter.class);
		homePresenter.start();
	}

	@Override
	public void stop() throws Exception {
		springContext.stop();
	}

	public static void main(String[] args) {
		launch(BillingSoftwareApplication.class, args);
	}
}
