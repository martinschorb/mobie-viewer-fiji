package projects;

import org.embl.mobie.viewer.MoBIE;
import org.embl.mobie.viewer.MoBIESettings;
import org.embl.mobie.viewer.source.ImageDataFormat;
import net.imagej.ImageJ;

import java.io.IOException;

public class OpenRemoteOpenOrganelle
{
    public static void main( String[] args )
    {
        final ImageJ imageJ = new ImageJ();
        imageJ.ui().showUI();
        try {
            new MoBIE("https://github.com/mobie/open-organelle-test", MoBIESettings.settings().imageDataFormat( ImageDataFormat.OpenOrganelleS3) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
