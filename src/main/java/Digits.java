import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num){
	int size = 0;
	int temp = num;
	if(num == 0){
		digitList.add(0);
	}
	else{
		for(int x = digitList.size()-1; x >= 0; x--){
		if(temp > 0){
	digitList.add(temp%10);
	temp = temp/10;
}
}
}
	}
	public boolean isStrictlyIncreasing(){
for(int x = 1; x < digitList.size(); x++){
if(digitList.get(x) < digitList.get(x-1)){
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
