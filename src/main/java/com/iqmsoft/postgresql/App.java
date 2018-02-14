package com.iqmsoft.postgresql;

public class App {

  public static void main(String[] args) throws Exception {
    MainContainer.newContainer()
        .start()
        .deploy(TestDeployment.createDeployment());
  }

}
