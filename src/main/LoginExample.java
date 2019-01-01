package main;

import materialize.MFrame;

public class LoginExample extends MFrame {
  private LoginExample() {
    super("Iniciar Sesión", 900, 500);
    initComponents();
  }

  private void initComponents(){

  }

  public static void main(String[] args) {
    new LoginExample().setVisible(true);
  }

}
