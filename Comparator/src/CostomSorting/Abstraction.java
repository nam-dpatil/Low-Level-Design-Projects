package CostomSorting;
interface ClgWebSite
{
	public void studyMaterials();
}
class SameClgStudent implements ClgWebSite
{
	@Override
	public void studyMaterials()
	{
		System.out.println("u can access all notes,videos..etc");
	}
}

class OtherStudents implements ClgWebSite
{
	public void studyMaterials()
	{
		System.out.println("u can not access all notes,videos..etc");
		System.out.println("u can access some basic notes");
	}
}

class ServiceClass
{
	ClgWebSite cw;
	public ClgWebSite check(int id, String pas)
	{
		if(id==1234 && pas.equals("1234"))
		{
			cw=new SameClgStudent();
		}
		else
		{
			cw=new OtherStudents();
		}
		return cw;
	}
}
public class Abstraction {
	

	public static void main(String[] args) {
		ServiceClass s=new ServiceClass();
		ClgWebSite cw=s.check(1234, "1234");
		cw.studyMaterials();
		ClgWebSite cw1=s.check(1234, "124");
		cw1.studyMaterials();
		

	}

}
