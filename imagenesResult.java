
package cachoahorasi;

import javax.swing.ImageIcon;

public class imagenesResult {
    public ImageIcon icoImagen;
    
    public ImageIcon Imaen(int  vDados){
        switch(vDados){
            case 1:
                icoImagen = new ImageIcon(getClass().getResource("/Imagenes/1.png"));break;
            case 2:
                icoImagen = new ImageIcon(getClass().getResource("/Imagenes/2.png"));break;
            case 3:
                icoImagen = new ImageIcon(getClass().getResource("/Imagenes/3.png"));break;
            case 4:
                icoImagen = new ImageIcon(getClass().getResource("/Imagenes/4.png"));break;
            case 5:
                icoImagen = new ImageIcon(getClass().getResource("/Imagenes/5.png"));break;
            case 6:
                icoImagen = new ImageIcon(getClass().getResource("/Imagenes/6.png"));break;
        }
        return icoImagen;
    }
    
}
