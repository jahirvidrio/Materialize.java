package materialize;

import javax.swing.*;
import java.awt.*;

public class MFrame extends JFrame {

  public MFrame(String windowTitle, int windowWidth, int windowHeight) {
    layout = new BorderLayout();
    primaryMPanel = new JPanel();
    paddingTop = new JPanel();
    paddingBottom = new JPanel();
    paddingLeft = new JPanel();
    paddingRight = new JPanel();

    setBackgroundColor(Color.WHITE);

    setLayout(layout);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle(windowTitle);

    setPadding(30);
    setSize(windowWidth, windowHeight);
    setLocationRelativeTo(null);

    primaryMPanel.setLayout(new BoxLayout(primaryMPanel, BoxLayout.Y_AXIS));


    add(primaryMPanel, BorderLayout.CENTER);
    add(paddingTop, BorderLayout.NORTH);
    add(paddingBottom, BorderLayout.SOUTH);
    add(paddingRight, BorderLayout.EAST);
    add(paddingLeft, BorderLayout.WEST);
  }

  public void add(JPanel panel) { primaryMPanel.add(panel); }

  public void setPadding(int padding) {
    padding -= 10;
    layout.setVgap(padding);
    layout.setHgap(padding);
  }

  public void setPadding(int vPadding, int hPadding) {
    layout.setHgap(hPadding);
    layout.setVgap(vPadding);
  }




  public void setBackgroundColor(Color backgroundColor) {
    this.getContentPane().setBackground(backgroundColor);
    this.primaryMPanel.setBackground(backgroundColor);
    this.paddingTop.setBackground(backgroundColor);
    this.paddingBottom.setBackground(backgroundColor);
    this.paddingLeft.setBackground(backgroundColor);
    this.paddingRight.setBackground(backgroundColor);
  }


  private JPanel primaryMPanel;
  private JPanel paddingTop;
  private JPanel paddingBottom;
  private JPanel paddingLeft;
  private JPanel paddingRight;
  private BorderLayout layout;
}
