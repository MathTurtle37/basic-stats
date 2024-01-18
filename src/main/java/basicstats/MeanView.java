package basicstats;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MeanView implements View {

  double mean;
  JTextField jtfMean;
  String name;

  public MeanView() {
    mean = 0;
    jtfMean = new JTextField(5);
    jtfMean.setEditable(false);
    name = "Mean";
  }

  @Override
  public void update(ArrayList<Double> numbers) {
    mean = BasicStats.mean(BasicStats.getArrayDouble(numbers));

    // Set text
    jtfMean.setText("" + mean);
  }

  @Override
  public void reset() {
    jtfMean.setText("");
  }

  @Override
  public JTextComponent show() {
    return jtfMean;
  }

  public String getName() {
    return name;
  }

  public double getMean() {
    return mean;
  }
}
