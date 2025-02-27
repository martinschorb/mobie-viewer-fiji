package projects;

import org.embl.mobie.viewer.MoBIESettings;
import org.embl.mobie.viewer.MoBIE;
import org.embl.mobie.viewer.source.ImageDataFormat;
import net.imagej.ImageJ;

import java.io.IOException;

public class OpenRemoteCLEMExample
{
	public static void main( String[] args ) throws IOException
	{
		final ImageJ imageJ = new ImageJ();
		imageJ.ui().showUI();

		new MoBIE("https://github.com/mobie/clem-example-project/", MoBIESettings.settings().gitProjectBranch( "update-views" ).imageDataFormat( ImageDataFormat.BdvN5S3 ).view( "tomos-merged" ) );
	}
}
