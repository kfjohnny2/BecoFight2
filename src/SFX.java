/**
 *
 * @author Johnnylee Bryan Marques da Rocha
 */
import javax.swing.JOptionPane;
import javazoom.jl.player.*;
import java.io.*;


public class SFX {

    public void executaSoco(){
        try{
            FileInputStream arquivo = new FileInputStream("C:/Beco Fight/mp3/PUNCH.mp3");
            BufferedInputStream mp3 = new BufferedInputStream(arquivo);
            Player tocar = new Player(mp3);
            tocar.play();
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
    }
}
