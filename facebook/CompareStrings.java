package facebook;

public class CompareStrings {


	public static boolean isMatch(char[] sA,char[] sB,int iALength,int iBLength)
	{
		if(iALength==0&&iBLength==0)
			return true;
		else
		{
			if(iALength>0)
			{
				if(sA[iALength-1]=='*')
					return isMatch(sA,sB,iALength-1,iBLength)||isMatch(sA,sB,iALength-2,iBLength);
				if(sA[iALength-1]=='.')
					return isMatch(sA,sB,iALength-1,iBLength)||isMatch(sA,sB,iALength-1,iBLength-1);
				if(iBLength>0)
					{
						if(sA[iALength-1]==sB[iBLength-1])
							return true;
						else
							return false;
					}
			}
			else
				return false;
		}
		return false;
	}


	public static void main(String args[])
	{

		//char[] sA;
		//char[] sB;
		int iALength;
		int iBLength;
		//sA=new char[7];
		//sB=new char[4];
		char[] sA={'a','b','*','c','*','d','.'};
		char[] sB={'a','b','d','g','h'};
		iALength=sA.length;
		iBLength=sB.length;
		if(isMatch(sA,sB,iALength,iBLength))
			System.out.println("match");
		else
			System.out.println("not match");

	
	}

}
