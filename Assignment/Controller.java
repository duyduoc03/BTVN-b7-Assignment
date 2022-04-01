package sesstion7.Assignment;

import javafx.Person;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField Ten;
    public TextField Gia;
    public TextField DonVi;
    public TextField SoLuong;
    public Text result;
    public Text errMsg;
    public void submit(){
        try {
            List l = new List(Ten.getText(),Double.parseDouble(Gia.getText()),DonVi.getText(),Integer.parseInt(SoLuong.getText()));
            result.setText(result.getText()+l.toString());

            Ten.setText("");
            Gia.setText("");
            DonVi.setText("");
            SoLuong.setText("");
            errMsg.setVisible(false);
        }
        catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }
    }
}
