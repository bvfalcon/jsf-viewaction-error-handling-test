package name.bychkov.test;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexPage implements Serializable
{
	public void doException()
	{
		throw new CustomException();
	}
}