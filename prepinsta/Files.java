package prepinsta;

import java.io.FileInputStream;

public class Files 
{	
	public static void main(String[] args) throws Exception {
		FileInputStream fi=new FileInputStream("");
		int i;
		while((i=fi.read())!=-1)
		{
			System.out.print(i);
		}
		fi.close();
	}

}
