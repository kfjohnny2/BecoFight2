/**
 *
 * @author Johnnylee Bryan Marques da Rocha
 */
    import javazoom.jl.player.Player;
    import java.io.FileInputStream;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Musica implements Runnable{
     public void run(){
         try{
             JFileChooser chooser = new JFileChooser();
             FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3", "mp3");

             chooser.setFileFilter(filter);
             chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
               int res = chooser.showOpenDialog(null);
               if(res == JFileChooser.APPROVE_OPTION){
                File diretorio = chooser.getSelectedFile();
                FileInputStream mp3 = new FileInputStream(diretorio);

                JOptionPane.showMessageDialog(null, "Você escolheu o diretório: " + diretorio.getAbsolutePath());
                Player tocar = new Player(mp3);
                tocar.play();
               }
               else{
                   JOptionPane.showMessageDialog(null, "Você não escolheu música alguma.");
               }


         }
        catch(Exception erro){
        erro.printStackTrace();

    }

         }

}

