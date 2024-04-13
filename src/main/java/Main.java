import Control.Control;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

public class Main {
    public static void main(String[] args) {
        FlatMaterialLighterIJTheme.setup();
        Control control=new Control();
        control.init();
    }

}
