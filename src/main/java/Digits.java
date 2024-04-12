import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
digitList = new ArrayList<Integer>();
int temp = num;
if(temp == 0) 
digitList.add(0,0);
		
while(temp >= 0){
digitList.add(0,temp%10);
temp = temp/10;
}
	}
	
	public boolean isStrictlyIncreasing(){
if(digitList.size() < 1)
	return true;
		
for(int x = 0; x < digitList.size()-1; x++){
if(digitList.get(x) > digitList.get(x+1)){
return false;
}
if(digitList.get(x) == digitList.get(x+1)){
	return false;
}
}
return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
