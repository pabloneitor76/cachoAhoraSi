
package cachoahorasi;

import javax.swing.ImageIcon;

public class imagenes1 {
    public ImageIcon icoImagen;
    public ImageIcon gifDado1(int Dado1){
        switch(Dado1){
            case 1:
                icoImagen =  new ImageIcon(getClass().getResource("/Pictures/dados-01.gif"));break;
               
            case 2:
                icoImagen = new ImageIcon(getClass().getResource("/Pictures/dados-02.gif"));break;
            case 3:
                icoImagen = new ImageIcon(getClass().getResource("/Pictures/dados-03.gif"));break;
            case 4:
                icoImagen = new ImageIcon(getClass().getResource("/Pictures/dados-04.gif"));break;
            case 5:
                icoImagen = new ImageIcon(getClass().getResource("/Pictures/dados-05.gif"));break;
            case 6:
                icoImagen = new ImageIcon(getClass().getResource("/Pictures/dados-06.gif"));break;
        }
        return icoImagen;
    }
}
